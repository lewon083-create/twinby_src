package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sw0 implements p2.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sw0 f10416a = new sw0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qw0 f10417b;

    static {
        qw0 qw0VarC = qw0.C();
        Intrinsics.checkNotNullExpressionValue(qw0VarC, "getDefaultInstance(...)");
        f10417b = qw0VarC;
    }

    @Override // p2.s0
    public final /* synthetic */ Object a() {
        return f10417b;
    }

    @Override // p2.s0
    public final Object b(InputStream inputStream, mj.a aVar) {
        try {
            return qw0.B((FileInputStream) inputStream);
        } catch (Exception unused) {
            return f10417b;
        }
    }

    @Override // p2.s0
    public final /* synthetic */ Object c(Object obj, OutputStream outputStream, mj.a aVar) {
        ((qw0) obj).c(outputStream);
        return Unit.f27471a;
    }
}
