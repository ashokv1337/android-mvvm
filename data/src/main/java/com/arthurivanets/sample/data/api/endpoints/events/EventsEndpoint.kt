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

package com.arthurivanets.sample.data.api.endpoints.events

import com.arthurivanets.sample.data.api.endpoints.Endpoint
import com.arthurivanets.sample.data.api.responses.CharactersResponse
import com.arthurivanets.sample.data.api.responses.ComicsResponse
import com.arthurivanets.sample.data.api.responses.EventsResponse
import io.reactivex.Single

interface EventsEndpoint : Endpoint {

    fun getEvent(id : Long) : Single<EventsResponse>

    fun getEvents(offset : Int = 0, limit : Int) : Single<EventsResponse>

    fun getEventCharacters(eventId : Long,
                           offset : Int = 0,
                           limit : Int) : Single<CharactersResponse>
    
    fun getEventComics(eventId : Long,
                       offset : Int = 0,
                       limit : Int) : Single<ComicsResponse>

}