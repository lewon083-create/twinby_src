package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.a;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class CacheControlHttpsConnectionPerformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f25311b;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface Client {
        String getOldETag();

        void onError();

        void onNotModified();

        void onResponse(@NonNull String str, @NonNull byte[] bArr);
    }

    public CacheControlHttpsConnectionPerformer(SSLSocketFactory sSLSocketFactory) {
        this(new a(), sSLSocketFactory);
    }

    public void performConnection(@NonNull String str, @NonNull Client client) {
        Response responseA;
        int code;
        String str2;
        try {
            a aVar = this.f25310a;
            String oldETag = client.getOldETag();
            SSLSocketFactory sSLSocketFactory = this.f25311b;
            aVar.getClass();
            responseA = a.a(oldETag, str, sSLSocketFactory);
            code = responseA.getCode();
        } catch (Throwable unused) {
        }
        if (code != 200) {
            if (code != 304) {
                client.onError();
                return;
            } else {
                client.onNotModified();
                return;
            }
        }
        List list = (List) CollectionUtils.getFromMapIgnoreCase(responseA.getHeaders(), "ETag");
        if (list == null || list.size() <= 0 || (str2 = (String) list.get(0)) == null) {
            str2 = "";
        }
        client.onResponse(str2, responseA.getResponseData());
    }

    public CacheControlHttpsConnectionPerformer(a aVar, SSLSocketFactory sSLSocketFactory) {
        this.f25310a = aVar;
        this.f25311b = sSLSocketFactory;
    }
}
