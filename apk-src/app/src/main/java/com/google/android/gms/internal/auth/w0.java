package com.google.android.gms.internal.auth;

import android.os.Parcel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements w, oa.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f13293d = new k0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13295c;

    public /* synthetic */ w0(int i, Object obj) {
        this.f13294b = i;
        this.f13295c = obj;
    }

    @Override // oa.m
    public void accept(Object obj, Object obj2) {
        b bVar = (b) this.f13295c;
        h2 h2Var = (h2) ((g2) obj).n();
        j2 j2Var = new j2((sb.g) obj2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(h2Var.f2257d);
        int i = d.f13188a;
        parcelObtain.writeStrongBinder(j2Var);
        d.b(parcelObtain, bVar);
        h2Var.T0(parcelObtain, 2);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[Catch: all -> 0x0029, TryCatch #5 {all -> 0x0029, all -> 0x0070, blocks: (B:6:0x0010, B:8:0x0014, B:10:0x0020, B:20:0x003d, B:72:0x0178, B:15:0x002c, B:17:0x0034, B:21:0x0042, B:23:0x0048, B:24:0x004c, B:71:0x0174, B:73:0x017b, B:74:0x017e, B:75:0x017f, B:25:0x0051, B:26:0x0054, B:27:0x0061, B:29:0x0067, B:35:0x007d, B:37:0x0083, B:38:0x0087, B:58:0x0146, B:59:0x0149, B:67:0x016b, B:66:0x0156, B:68:0x016c, B:69:0x0171, B:70:0x0172, B:30:0x006d, B:34:0x0074), top: B:109:0x0010 }] */
    @Override // com.google.android.gms.internal.auth.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h() {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.w0.h():java.lang.Object");
    }

    public /* synthetic */ w0(a aVar, b bVar) {
        this.f13294b = 3;
        this.f13295c = bVar;
    }

    public w0() {
        a1 a1Var;
        this.f13294b = 0;
        try {
            a1Var = (a1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            a1Var = f13293d;
        }
        v0 v0Var = new v0(k0.f13252b, a1Var);
        Charset charset = o0.f13269a;
        this.f13295c = v0Var;
    }
}
