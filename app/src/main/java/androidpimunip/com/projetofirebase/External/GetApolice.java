package androidpimunip.com.projetofirebase.External;

import androidpimunip.com.projetofirebase.Model.ApoliceModel;
import androidpimunip.com.projetofirebase.Model.UserModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetApolice {
    @GET("/DeehModesto/9d0417bf706c4edb6c63ac6e6e32faf7/raw/46e6aeeabdcd5084b4cbbdcea09ec62854400539/apolice.json")
    Call<ApoliceModel> getApolice();
}
