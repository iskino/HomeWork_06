package otus.homework.reactivecats.data

import io.reactivex.Single
import retrofit2.http.GET

interface CatsService {

    @GET("random?animal_type=cat")
    fun getCatFact(): Single<Fact>
}