/*
 * Copyright 2018 Arthur Ivanets, arthur.ivanets.l@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.arthurivanets.sample.data.api.services

import com.arthurivanets.sample.data.api.endpoints.EndpointPaths
import com.arthurivanets.sample.data.api.responses.CharactersResponse
import com.arthurivanets.sample.data.api.responses.ComicsResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 *
 */
interface CharactersService {

    /**
     *
     */
    @GET(EndpointPaths.Characters.LIST_SINGLE)
    fun getCharacterAsync(@Path(EndpointPaths.Params.ID) id : Long) : Single<CharactersResponse>

    /**
     *
     */
    @GET(EndpointPaths.Characters.BASE)
    fun getCharactersAsync(@Query(EndpointPaths.Params.OFFSET) offset : Int? = null,
                           @Query(EndpointPaths.Params.LIMIT) limit : Int? = null) : Single<CharactersResponse>

    /**
     *
     */
    @GET(EndpointPaths.Characters.LIST_COMICS)
    fun getCharacterComicsAsync(@Path(EndpointPaths.Params.ID) characterId : Long,
                                @Query(EndpointPaths.Params.OFFSET) offset : Int? = null,
                                @Query(EndpointPaths.Params.LIMIT) limit : Int? = null) : Single<ComicsResponse>

}