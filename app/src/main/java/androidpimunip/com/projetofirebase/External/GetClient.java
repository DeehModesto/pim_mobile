package androidpimunip.com.projetofirebase.External;

import androidpimunip.com.projetofirebase.Model.UserModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetClient {
    @GET("/DeehModesto/9546e7f1afa6d9df4ee7c8b65fb4b9e0/raw/140bcb806d7a3f8835798880de4029a9d540d840/cliente.json")
    Call<UserModel> getClient();
}
