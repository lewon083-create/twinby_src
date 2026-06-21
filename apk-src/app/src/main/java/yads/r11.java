package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class r11 extends q30 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42441d;

    public r11() {
        super(a(2008, 1));
        this.f42441d = 1;
    }

    public static int a(int i, int i10) {
        if (i == 2000 && i10 == 1) {
            return 2001;
        }
        return i;
    }

    public static r11 a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? VKApiCodes.CODE_PHONE_ALREADY_USED : (message == null || !ki.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new q11(iOException) : new r11(iOException, i10, i);
    }

    public r11(IOException iOException, int i, int i10) {
        super(iOException, a(i, i10));
        this.f42441d = i10;
    }

    public r11(String str, int i) {
        super(a(i, 1), str);
        this.f42441d = 1;
    }

    public r11(String str, IOException iOException, int i) {
        super(str, iOException, a(i, 1));
        this.f42441d = 1;
    }
}
