package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class cx1 extends tp1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4370b;

    public cx1(IllegalStateException illegalStateException, dx1 dx1Var) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(dx1Var == null ? null : dx1Var.f4712a)), illegalStateException);
        if (illegalStateException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) illegalStateException;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.f4370b = errorCode;
    }
}
