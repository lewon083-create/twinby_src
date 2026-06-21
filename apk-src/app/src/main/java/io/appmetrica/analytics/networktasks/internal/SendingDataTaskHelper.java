package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class SendingDataTaskHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f25352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Compressor f25353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeProvider f25354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f25355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f25356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NetworkResponseHandler f25357f;

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f25357f.handle(this.f25356e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f25355d.applySendTime(this.f25354c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(@NonNull byte[] bArr) {
        byte[] bArrEncrypt;
        try {
            byte[] bArrCompress = this.f25353b.compress(bArr);
            if (bArrCompress != null && (bArrEncrypt = this.f25352a.encrypt(bArrCompress)) != null) {
                this.f25355d.setPostData(bArrEncrypt);
                return true;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull TimeProvider timeProvider, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f25352a = requestBodyEncrypter;
        this.f25353b = compressor;
        this.f25354c = timeProvider;
        this.f25355d = requestDataHolder;
        this.f25356e = responseDataHolder;
        this.f25357f = networkResponseHandler;
    }
}
