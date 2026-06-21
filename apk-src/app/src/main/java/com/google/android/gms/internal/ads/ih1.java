package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ih1 extends t91 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6494c;

    public ih1() {
        this.f6494c = 1;
    }

    public static ih1 a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? VKApiCodes.CODE_PHONE_ALREADY_USED : (message == null || !ix.h(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new lg1("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new ih1(iOException, i10, i);
    }

    public ih1(IOException iOException, int i, int i10) {
        super(iOException, i == 2000 ? i10 != 1 ? 2000 : 2001 : i);
        this.f6494c = i10;
    }

    public ih1(String str, int i, int i10) {
        super(str, i == 2000 ? i10 != 1 ? 2000 : 2001 : i);
        this.f6494c = i10;
    }

    public ih1(String str, IOException iOException, int i, int i10) {
        super(str, iOException, i == 2000 ? i10 != 1 ? 2000 : 2001 : i);
        this.f6494c = i10;
    }
}
