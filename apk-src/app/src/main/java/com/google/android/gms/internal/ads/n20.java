package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n20 implements z71 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n20 f8153b = new n20(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n20 f8154c = new n20(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n20 f8155d = new n20(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n20 f8156e = new n20(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n20 f8157f = new n20(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n20 f8158g = new n20(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n20 f8159h = new n20(8);
    public static final /* synthetic */ n20 i = new n20(9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ n20 f8160j = new n20(10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ n20 f8161k = new n20(11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n20 f8162l = new n20(12);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ n20 f8163m = new n20(13);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ n20 f8164n = new n20(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8165a;

    public /* synthetic */ n20(int i10) {
        this.f8165a = i10;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) throws IOException {
        int i10 = -1;
        String str = "";
        int i11 = 8;
        int i12 = 0;
        String str2 = null;
        int i13 = 1;
        switch (this.f8165a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.Gb)).booleanValue()) {
                    p9.k.C.f31302h.f("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th2);
                } else {
                    p9.k.C.f31302h.e("GetTopicsApiWithRecordObservationActionHandler", th2);
                }
                v41 v41Var = x41.f12018c;
                return vv.d(new h6.c(r51.f9713f));
            case 1:
                t9.c0.n("Error during loading assets.", (Exception) obj);
                return n81.f8237c;
            case 2:
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return vv.y(cause);
            case 3:
                return vv.y(new uf0(5));
            case 4:
                return vv.d(((pg0) obj).f9047a);
            case 5:
                return n81.f8237c;
            case 6:
                Throwable cause2 = (ExecutionException) obj;
                if (cause2.getCause() != null) {
                    cause2 = cause2.getCause();
                }
                return vv.y(cause2);
            case 7:
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                hx.f6279a.execute(new th0(i11, (InputStream) obj, parcelFileDescriptorArrCreatePipe[1]));
                return vv.d(parcelFileDescriptor);
            case 8:
                return ((Throwable) obj) instanceof TimeoutException ? vv.d(new kl0(Integer.toString(17), i13)) : vv.d(new kl0(str2, i13));
            case 9:
                return vv.d(new kl0((String) obj, i13));
            case 10:
                ga.b bVar = (ga.b) obj;
                return bVar == null ? vv.d(new xl0(str2, i10, i12)) : vv.d(new xl0(bVar.f20059a, bVar.f20060b, i12));
            case 11:
                h6.c cVar = (h6.c) obj;
                if (cVar == null) {
                    return vv.d(new xl0(str, i13, i13));
                }
                bq1 bq1VarZ = cq1.z();
                for (h6.d dVar : cVar.f20438a) {
                    zp1 zp1VarZ = aq1.z();
                    int i14 = dVar.f20442c;
                    zp1VarZ.b();
                    ((aq1) zp1VarZ.f9560c).A(i14);
                    long j10 = dVar.f20441b;
                    zp1VarZ.b();
                    ((aq1) zp1VarZ.f9560c).B(j10);
                    long j11 = dVar.f20440a;
                    zp1VarZ.b();
                    ((aq1) zp1VarZ.f9560c).C(j11);
                    aq1 aq1Var = (aq1) zp1VarZ.d();
                    bq1VarZ.b();
                    ((cq1) bq1VarZ.f9560c).A(aq1Var);
                }
                return vv.d(new xl0(Base64.encodeToString(((cq1) bq1VarZ.d()).b(), 1), i13, i13));
            case 12:
                ga.b bVar2 = (ga.b) obj;
                int i15 = 2;
                return bVar2 == null ? vv.d(new xl0(str2, i10, i15)) : vv.d(new xl0(bVar2.f20059a, bVar2.f20060b, i15));
            case 13:
                return n81.f8237c;
            case 14:
                return vv.d("");
            default:
                cz0 cz0Var = (cz0) obj;
                return vv.K(cz0Var.j(), new ju(i11, cz0Var), f81.f5272b);
        }
    }
}
