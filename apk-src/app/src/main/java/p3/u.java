package p3;

import com.google.android.gms.internal.measurement.j4;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class u extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31205c;

    public u() {
        super(2008);
        this.f31205c = 1;
    }

    public static u a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? VKApiCodes.CODE_PHONE_ALREADY_USED : (message == null || !j4.x(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new t("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new u(iOException, i10, i);
    }

    public u(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.f31205c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(IOException iOException, int i, int i10) {
        if (i == 2000 && i10 == 1) {
            i = 2001;
        }
        super(iOException, i);
        this.f31205c = i10;
    }

    public u(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.f31205c = 1;
    }
}
