package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y11 implements w11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j21 f12459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12460b;

    public y11(j21 j21Var, long j10) {
        this.f12459a = j21Var;
        this.f12460b = j10;
    }

    public static boolean c(bz0 bz0Var) {
        int iZ = bz0Var.A().z().z();
        int iA = bz0Var.A().z().A();
        byte[] versionArray = nz.j();
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iZ);
        byteBufferAllocate.putInt(iA);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final boolean a(bz0 bz0Var) {
        j21 j21Var = this.f12459a;
        if (bz0Var == null || bz0Var.equals(bz0.E())) {
            j21Var.b(20204);
            return false;
        }
        if (c(bz0Var)) {
            return true;
        }
        j21Var.b(20206);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final boolean b(bz0 bz0Var) {
        j21 j21Var = this.f12459a;
        if (bz0Var == null || bz0Var.equals(bz0.E())) {
            j21Var.b(20202);
            return true;
        }
        if (!c(bz0Var)) {
            j21Var.b(20205);
            return true;
        }
        boolean z5 = bz0Var.A().B() - System.currentTimeMillis() <= this.f12460b;
        if (z5) {
            j21Var.b(20203);
        }
        return z5;
    }
}
