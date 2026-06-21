package a1;

import a0.l1;
import a0.r1;
import a0.y;
import ad.e0;
import ad.j0;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.ArrayMap;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import cj.v;
import com.google.android.gms.internal.ads.cp1;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.pf;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.play_billing.b5;
import com.google.android.gms.internal.play_billing.c5;
import com.google.android.gms.internal.play_billing.j5;
import com.google.android.gms.internal.play_billing.k5;
import com.google.android.gms.internal.play_billing.n5;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.o5;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.u4;
import com.google.android.gms.internal.play_billing.y4;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import com.yandex.varioqub.config.model.ConfigValue;
import d8.m0;
import e1.g0;
import e1.h0;
import e1.i0;
import e1.x;
import e4.c0;
import e4.f0;
import e4.w;
import g0.a2;
import g0.b1;
import g0.c1;
import g0.g2;
import g0.h2;
import g0.j1;
import g0.k1;
import g0.r2;
import g0.s0;
import g0.u2;
import g0.x2;
import i4.a1;
import j3.d0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q4.a0;
import t.x1;
import t.z;
import t1.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements k0.c, b4.m, ga.a, f2.f, m4.p, m0, g0, q4.m, f7.h, NativeAdLoadListener, k1, b1, oa.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f324d;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f322b = i;
        this.f324d = obj;
        this.f323c = obj2;
    }

    public g2 A() {
        g2 g2Var = new g2();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f324d).entrySet()) {
            u2 u2Var = (u2) entry.getValue();
            if (u2Var.f19781e) {
                g2Var.a(u2Var.f19777a);
                arrayList.add((String) entry.getKey());
            }
        }
        com.google.android.gms.internal.auth.g.e("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + ((String) this.f323c));
        return g2Var;
    }

    @Override // b4.m
    public void B(o4.h hVar, Handler handler) {
        ((MediaCodec) this.f323c).setOnFrameRenderedListener(new b4.b(this, hVar, 1), handler);
    }

    public Collection C() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f324d).entrySet()) {
            if (((u2) entry.getValue()).f19781e) {
                arrayList.add(((u2) entry.getValue()).f19777a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    @Override // b4.m
    public ByteBuffer D(int i) {
        return ((MediaCodec) this.f323c).getInputBuffer(i);
    }

    public Collection E() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f324d).entrySet()) {
            if (((u2) entry.getValue()).f19781e) {
                arrayList.add(((u2) entry.getValue()).f19778b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    @Override // b4.m
    public void F(Surface surface) {
        ((MediaCodec) this.f323c).setOutputSurface(surface);
    }

    @Override // q4.m
    public void G() {
        e4.s sVar = (e4.s) this.f324d;
        sVar.f16181c.post(new e4.o(sVar, 0));
    }

    @Override // b4.m
    public ByteBuffer H(int i) {
        return ((MediaCodec) this.f323c).getOutputBuffer(i);
    }

    public File I() {
        if (((File) this.f323c) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f323c) == null) {
                        fd.g gVar = (fd.g) this.f324d;
                        gVar.a();
                        this.f323c = new File(gVar.f16758a.getFilesDir(), "PersistedInstallation." + ((fd.g) this.f324d).g() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f323c;
    }

    public c1 J(int i) {
        HashMap map = (HashMap) this.f324d;
        return (map == null || !map.containsKey(Integer.valueOf(i))) ? ((b1) this.f323c).u(i) : (c1) map.get(Integer.valueOf(i));
    }

    @Override // b4.m
    public void K(ArrayList arrayList) {
        ((MediaCodec) this.f323c).subscribeToVendorParameters(arrayList);
    }

    @Override // b4.m
    public void L(ArrayList arrayList) {
        ((MediaCodec) this.f323c).unsubscribeFromVendorParameters(arrayList);
    }

    public void M(ae.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f911a);
            jSONObject.put("Status", z.m(bVar.f912b));
            jSONObject.put("AuthToken", bVar.f913c);
            jSONObject.put("RefreshToken", bVar.f914d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f916f);
            jSONObject.put("ExpiresInSecs", bVar.f915e);
            jSONObject.put("FisError", bVar.f917g);
            fd.g gVar = (fd.g) this.f324d;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f16758a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(I())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public boolean N(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f324d;
        if (linkedHashMap.containsKey(str)) {
            return ((u2) linkedHashMap.get(str)).f19781e;
        }
        return false;
    }

    public void O() {
        ArrayList arrayList = (ArrayList) this.f324d;
        if (((a0.b1) this.f323c) == null) {
            return;
        }
        for (Object obj : arrayList) {
            if (obj instanceof v) {
                a0.b1 b1Var = (a0.b1) this.f323c;
                String str = ((v) obj).f2361a;
                b1Var.getClass();
                Intrinsics.checkNotNullParameter("VideoError", "errorCode");
                ((ii.g) b1Var.f45c).a("VideoError", str);
            } else {
                ((ii.g) ((a0.b1) this.f323c).f45c).b((cj.q) obj);
            }
        }
        arrayList.clear();
    }

    @Override // q4.m
    public a0 P(int i, int i10) {
        return (a1) this.f323c;
    }

    public void Q(e eVar) {
        e4.b bVar;
        e4.m mVar = (e4.m) this.f324d;
        c0 c0VarA = c0.f16057c;
        String str = (String) ((f0) eVar.f324d).f16098a.get("range");
        if (str != null) {
            try {
                c0VarA = c0.a(str);
            } catch (d0 e3) {
                mVar.f16147b.f("SDP format error.", e3);
                return;
            }
        }
        Uri uri = mVar.i;
        e4.p pVar = mVar.f16147b;
        ad.q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        int i10 = 0;
        while (true) {
            ad.b1 b1Var = ((f0) eVar.f324d).f16099b;
            if (i >= b1Var.f770e) {
                ad.b1 b1VarP = j0.p(i10, objArrCopyOf);
                if (b1VarP.isEmpty()) {
                    pVar.f("No playable track.", null);
                    return;
                }
                pVar.getClass();
                long j10 = c0VarA.f16060b;
                e4.s sVar = (e4.s) pVar.f16169c;
                for (int i11 = 0; i11 < b1VarP.f770e; i11++) {
                    e4.r rVar = new e4.r(sVar, (w) b1VarP.get(i11), i11, sVar.i);
                    sVar.f16184f.add(rVar);
                    rVar.f16175b.f(rVar.f16174a.f16171b, sVar.f16182d, 0);
                }
                e4.v vVar = (e4.v) sVar.f16186h.f491c;
                vVar.f16205m = m3.z.M(j10 - c0VarA.f16059a);
                vVar.f16206n = !(j10 == -9223372036854775807L);
                vVar.f16207o = j10 == -9223372036854775807L;
                vVar.f16208p = false;
                vVar.x();
                mVar.f16161q = true;
                return;
            }
            bVar = (e4.b) b1Var.get(i);
            String strY = j4.y(bVar.f16052j.f16033b);
            strY.getClass();
            switch (strY) {
                case "MPEG4-GENERIC":
                case "L8":
                case "AC3":
                case "AMR":
                case "L16":
                case "VP8":
                case "VP9":
                case "H264":
                case "H265":
                case "OPUS":
                case "PCMA":
                case "PCMU":
                case "MP4A-LATM":
                case "AMR-WB":
                case "MP4V-ES":
                case "H263-1998":
                case "H263-2000":
                    w wVar = new w((e4.n) eVar.f323c, bVar, uri);
                    int i12 = i10 + 1;
                    int iF = e0.f(objArrCopyOf.length, i12);
                    if (iF > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                    }
                    objArrCopyOf[i10] = wVar;
                    i10 = i12;
                    break;
            }
            i++;
        }
    }

    public void R() {
        e4.m mVar = (e4.m) this.f324d;
        h5.r(mVar.f16160p == 2);
        mVar.f16160p = 1;
        mVar.f16163s = false;
        long j10 = mVar.f16164t;
        if (j10 != -9223372036854775807L) {
            mVar.i(m3.z.Z(j10));
        }
    }

    public void S(d2.f fVar) {
        j0.e eVar = (j0.e) this.f324d;
        m4.d dVar = (m4.d) this.f323c;
        int i = fVar.f15541b;
        if (i != 0) {
            eVar.execute(new pf(dVar, i, 9));
        } else {
            eVar.execute(new k0.i(4, dVar, fVar.f15540a));
        }
    }

    public ae.b T() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(I());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i10 = ae.b.f910h;
        byte b2 = (byte) (((byte) (0 | 2)) | 1);
        int i11 = z.p(5)[iOptInt];
        if (i11 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b10 = (byte) (((byte) (b2 | 2)) | 1);
        if (b10 == 3 && i11 != 0) {
            return new ae.b(strOptString, i11, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 0) {
            sb2.append(" registrationStatus");
        }
        if ((b10 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
    }

    public void U(g8.c cVar, boolean z5) {
        PendingIntent activity;
        d8.a aVar = (d8.a) cVar.f20015g;
        String str = aVar.f15576b;
        String str2 = aVar.f15577c;
        Context context = (Context) this.f323c;
        int identifier = context.getResources().getIdentifier(str, str2, context.getPackageName());
        if (identifier == 0) {
            Context context2 = (Context) this.f323c;
            context2.getResources().getIdentifier("ic_launcher.png", "mipmap", context2.getPackageName());
        }
        t1.l lVar = (t1.l) this.f324d;
        String str3 = (String) cVar.f20012d;
        lVar.getClass();
        lVar.f33359e = t1.l.b(str3);
        lVar.f33372s.icon = identifier;
        lVar.f33360f = t1.l.b((String) cVar.f20013e);
        Context context3 = (Context) this.f323c;
        Intent launchIntentForPackage = context3.getPackageManager().getLaunchIntentForPackage(context3.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage(null);
            launchIntentForPackage.setFlags(270532608);
            activity = PendingIntent.getActivity(context3, 0, launchIntentForPackage, 201326592);
        } else {
            activity = null;
        }
        lVar.f33361g = activity;
        lVar.c(2, cVar.f20011c);
        this.f324d = lVar;
        Integer num = (Integer) cVar.f20016h;
        if (num != null) {
            lVar.f33368o = num.intValue();
            this.f324d = lVar;
        }
        if (z5) {
            Context context4 = (Context) this.f323c;
            u uVar = new u(context4);
            Notification notificationA = ((t1.l) this.f324d).a();
            Bundle bundle = notificationA.extras;
            if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
                uVar.f33393a.notify(null, 75415, notificationA);
                return;
            }
            t1.q qVar = new t1.q(context4.getPackageName(), 75415, notificationA);
            synchronized (u.f33391e) {
                try {
                    if (u.f33392f == null) {
                        u.f33392f = new t1.t(context4.getApplicationContext());
                    }
                    u.f33392f.f33385c.obtainMessage(0, qVar).sendToTarget();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            uVar.f33393a.cancel(null, 75415);
        }
    }

    public void V(String str, h2 h2Var, x2 x2Var, g0.n nVar, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f324d;
        if (linkedHashMap.containsKey(str)) {
            u2 u2Var = new u2(h2Var, x2Var, nVar, list);
            u2 u2Var2 = (u2) linkedHashMap.get(str);
            u2Var.f19781e = u2Var2.f19781e;
            u2Var.f19782f = u2Var2.f19782f;
            linkedHashMap.put(str, u2Var);
        }
    }

    public void W(s4 s4Var) {
        if (s4Var == null) {
            return;
        }
        try {
            j5 j5VarT = k5.t();
            j5VarT.e((c5) this.f323c);
            j5VarT.d();
            k5.n((k5) j5VarT.f14184c, s4Var);
            ((ac.c) this.f324d).w((k5) j5VarT.b());
        } catch (Throwable th2) {
            o1.h("BillingLogger", "Unable to log.", th2);
        }
    }

    public void X(s4 s4Var, int i) {
        try {
            b5 b5Var = (b5) ((c5) this.f323c).g();
            b5Var.d();
            c5.n((c5) b5Var.f14184c, i);
            this.f323c = (c5) b5Var.b();
            W(s4Var);
        } catch (Throwable th2) {
            o1.h("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Y(u4 u4Var) {
        if (u4Var == null) {
            return;
        }
        try {
            j5 j5VarT = k5.t();
            j5VarT.e((c5) this.f323c);
            j5VarT.d();
            k5.o((k5) j5VarT.f14184c, u4Var);
            ((ac.c) this.f324d).w((k5) j5VarT.b());
        } catch (Throwable th2) {
            o1.h("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Z(y4 y4Var) {
        try {
            j5 j5VarT = k5.t();
            j5VarT.e((c5) this.f323c);
            j5VarT.d();
            k5.p((k5) j5VarT.f14184c, y4Var);
            ((ac.c) this.f324d).w((k5) j5VarT.b());
        } catch (Throwable th2) {
            o1.h("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // b4.m
    public void a(Bundle bundle) {
        ((MediaCodec) this.f323c).setParameters(bundle);
    }

    public void a0(n5 n5Var) {
        try {
            ac.c cVar = (ac.c) this.f324d;
            j5 j5VarT = k5.t();
            j5VarT.e((c5) this.f323c);
            j5VarT.d();
            k5.r((k5) j5VarT.f14184c, n5Var);
            cVar.w((k5) j5VarT.b());
        } catch (Throwable th2) {
            o1.h("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // oa.m
    public void accept(Object obj, Object obj2) {
        gb.g gVar;
        ma.d dVar;
        sb.g gVar2 = (sb.g) obj2;
        gb.h hVar = (gb.h) obj;
        i4 i4Var = (i4) this.f323c;
        LocationRequest locationRequest = (LocationRequest) this.f324d;
        hVar.getClass();
        oa.k kVarN = i4Var.n();
        oa.i iVar = (oa.i) kVarN.f29860c;
        Objects.requireNonNull(iVar);
        ma.d[] dVarArrI = hVar.i();
        boolean z5 = false;
        if (dVarArrI != null) {
            int i = 0;
            while (true) {
                if (i >= dVarArrI.length) {
                    dVar = null;
                    break;
                }
                dVar = dVarArrI[i];
                if ("location_updates_with_callback".equals(dVar.f28768b)) {
                    break;
                } else {
                    i++;
                }
            }
            if (dVar != null && dVar.c() >= 1) {
                z5 = true;
            }
        }
        synchronized (hVar.B) {
            try {
                gb.g gVar3 = (gb.g) hVar.B.get(iVar);
                if (gVar3 == null || z5) {
                    gb.g gVar4 = new gb.g(i4Var);
                    hVar.B.put(iVar, gVar4);
                    gVar = gVar4;
                } else {
                    i4 i4Var2 = gVar3.f20074c;
                    synchronized (i4Var2) {
                        oa.k kVar = (oa.k) i4Var2.f13782c;
                        if (kVar != kVarN) {
                            kVar.f29859b = null;
                            kVar.f29860c = null;
                            i4Var2.f13782c = kVarN;
                        }
                    }
                    gVar = gVar3;
                    gVar3 = null;
                }
                if (z5) {
                    gb.w wVar = (gb.w) hVar.n();
                    gb.j jVar = new gb.j(2, gVar3 == null ? null : gVar3, gVar, null, iVar.a());
                    gb.e eVar = new gb.e(null, gVar2);
                    Parcel parcelD0 = wVar.D0();
                    gb.b.b(parcelD0, jVar);
                    gb.b.b(parcelD0, locationRequest);
                    parcelD0.writeStrongBinder(eVar);
                    wVar.T0(parcelD0, 88);
                } else {
                    gb.g gVar5 = gVar;
                    gb.w wVar2 = (gb.w) hVar.n();
                    gb.l lVar = new gb.l(1, new gb.k(locationRequest, null, false, false, false, false, Long.MAX_VALUE), null, gVar5, null, new gb.c(gVar2, gVar5), iVar.a());
                    Parcel parcelD02 = wVar2.D0();
                    gb.b.b(parcelD02, lVar);
                    wVar2.T0(parcelD02, 59);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.k1
    public r1 acquireLatestImage() {
        return v(((i4) this.f323c).acquireLatestImage());
    }

    @Override // ga.a
    public Task b() {
        Task taskB = ((bb.h) this.f323c).b();
        a7.l lVar = new a7.l(7, this);
        sb.m mVar = (sb.m) taskB;
        mVar.getClass();
        return mVar.f(sb.h.f32859a, lVar);
    }

    public void b0(o5 o5Var) {
        if (o5Var == null) {
            return;
        }
        try {
            j5 j5VarT = k5.t();
            j5VarT.e((c5) this.f323c);
            j5VarT.d();
            k5.s((k5) j5VarT.f14184c, o5Var);
            ((ac.c) this.f324d).w((k5) j5VarT.b());
        } catch (Throwable th2) {
            o1.h("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // g0.k1
    public void c(j1 j1Var, Executor executor) {
        ((i4) this.f323c).c(new y(9, this, j1Var), executor);
    }

    @Override // g0.k1
    public void close() {
        ((i4) this.f323c).close();
    }

    @Override // b4.m
    public void d(int i, cp1 cp1Var, long j10, int i10) {
        ((MediaCodec) this.f323c).queueSecureInputBuffer(i, 0, cp1Var.i, j10, i10);
    }

    @Override // g0.k1
    public int e() {
        return ((i4) this.f323c).e();
    }

    @Override // b4.m
    public void f(int i, int i10, long j10, int i11) {
        ((MediaCodec) this.f323c).queueInputBuffer(i, 0, i10, j10, i11);
    }

    @Override // b4.m
    public void flush() {
        ((MediaCodec) this.f323c).flush();
    }

    @Override // b4.m
    public void g(int i) {
        ((MediaCodec) this.f323c).releaseOutputBuffer(i, false);
    }

    @Override // f2.f
    public Object get() {
        x0.a aVar = (x0.a) this.f323c;
        int iY = hl.d.y(aVar);
        int iZ = hl.d.z(aVar);
        int i = aVar.f35505e;
        if (i == -1) {
            com.google.android.gms.internal.auth.g.e("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            i = 1;
        } else {
            com.google.android.gms.internal.auth.g.e("DefAudioResolver", "Using supplied AUDIO channel count: " + i);
        }
        Range range = aVar.f35504d;
        d1.d dVarA = hl.d.A(range, x0.a.f35500g.equals(range) ? 44100 : ((Integer) range.getUpper()).intValue(), i, iY, (Rational) this.f324d);
        int i10 = dVarA.f15516b;
        int i11 = dVarA.f15515a;
        com.google.android.gms.internal.auth.g.e("DefAudioResolver", om1.j("Using AUDIO sample rate resolved from AudioSpec: Capture sample rate: ", i11, "Hz. Encode sample rate: ", i10, "Hz."));
        List list = n.f367f;
        m mVar = new m();
        mVar.f362b = -1;
        mVar.f363c = -1;
        mVar.f364d = -1;
        mVar.f365e = -1;
        mVar.f366f = -1;
        mVar.f362b = Integer.valueOf(iY);
        mVar.f366f = Integer.valueOf(iZ);
        mVar.f365e = Integer.valueOf(i);
        mVar.f363c = Integer.valueOf(i11);
        mVar.f364d = Integer.valueOf(i10);
        return mVar.a();
    }

    @Override // g0.k1
    public int getHeight() {
        return ((i4) this.f323c).getHeight();
    }

    @Override // g0.k1
    public Surface getSurface() {
        return ((i4) this.f323c).getSurface();
    }

    @Override // g0.k1
    public int getWidth() {
        return ((i4) this.f323c).getWidth();
    }

    @Override // g0.k1
    public void h() {
        ((i4) this.f323c).h();
    }

    @Override // e1.g0
    public long i() {
        return ((Long) ((a0.a0) this.f323c).apply(Long.valueOf(((nc.e) this.f324d).i()))).longValue();
    }

    @Override // g0.b1
    public boolean k(int i) {
        return J(i) != null;
    }

    @Override // m4.p
    public Object m(Uri uri, p3.j jVar) {
        d4.a aVar = (d4.a) ((m4.p) this.f323c).m(uri, jVar);
        List list = (List) this.f324d;
        return (list == null || list.isEmpty()) ? aVar : (d4.a) aVar.a(list);
    }

    @Override // e1.g0
    public long n() {
        return ((Long) ((a0.a0) this.f323c).apply(Long.valueOf(((nc.e) this.f324d).n()))).longValue();
    }

    @Override // b4.m
    public MediaFormat o() {
        return ((MediaCodec) this.f323c).getOutputFormat();
    }

    @Override // k0.c
    public void onFailure(Throwable th2) {
        switch (this.f322b) {
            case 0:
                g gVar = (g) this.f324d;
                if (gVar.f336l == ((x) this.f323c)) {
                    com.google.android.gms.internal.auth.g.e("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
                    if (!(th2 instanceof IllegalStateException)) {
                        Executor executor = gVar.f334j;
                        x0.v vVar = gVar.f335k;
                        if (executor != null && vVar != null) {
                            executor.execute(new a0.d(5, vVar, th2));
                            break;
                        }
                    }
                }
                break;
            case 15:
                e1.c0 c0Var = ((e1.a0) this.f324d).f15894l;
                c0Var.f15930o.remove((e1.j) this.f323c);
                if (!(th2 instanceof MediaCodec.CodecException)) {
                    c0Var.b(th2.getMessage(), th2, 0);
                } else {
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th2;
                    c0Var.b(codecException.getMessage(), codecException, 1);
                }
                break;
            case 22:
                b4.e();
                f0.o oVar = (f0.o) this.f323c;
                x1 x1Var = (x1) this.f324d;
                if (oVar == ((f0.o) x1Var.f33317b)) {
                    com.google.android.gms.internal.auth.g.O("CaptureNode", "request aborted, id=" + ((f0.o) x1Var.f33317b).f16529a);
                    e eVar = (e) x1Var.f33322g;
                    if (eVar != null) {
                        eVar.f324d = null;
                    }
                    x1Var.f33317b = null;
                }
                break;
            default:
                f0.s sVar = (f0.s) this.f324d;
                e eVar2 = (e) this.f323c;
                if (!((f0.q) eVar2.f324d).f16548g) {
                    int iB = ((s0) ((ArrayList) eVar2.f323c).get(0)).b();
                    if (th2 instanceof l1) {
                        m mVar = sVar.f16554d;
                        f0.e eVar3 = new f0.e(iB, (l1) th2);
                        mVar.getClass();
                        b4.e();
                        ((f0.a) mVar.f366f).f16484k.accept(eVar3);
                    } else {
                        m mVar2 = sVar.f16554d;
                        f0.e eVar4 = new f0.e(iB, new l1("Failed to submit capture request", th2, 2));
                        mVar2.getClass();
                        b4.e();
                        ((f0.a) mVar2.f366f).f16484k.accept(eVar4);
                    }
                    sVar.f16553c.k();
                    break;
                }
                break;
        }
    }

    @Override // k0.c
    public void onSuccess(Object obj) {
        switch (this.f322b) {
            case 0:
                e1.t tVar = (e1.t) obj;
                g gVar = (g) this.f324d;
                boolean z5 = gVar.i;
                t tVar2 = gVar.f330e;
                s sVar = gVar.f329d;
                if (!z5 || gVar.f336l != ((x) this.f323c)) {
                    tVar.a();
                    return;
                }
                if (gVar.f339o) {
                    f2.g.h(null, gVar.f340p > 0);
                    if (System.nanoTime() - gVar.f340p >= gVar.f331f) {
                        f2.g.h(null, gVar.f339o);
                        try {
                            sVar.c();
                            com.google.android.gms.internal.auth.g.e("AudioSource", "Retry start AudioStream succeed");
                            tVar2.a();
                            tVar2.f395a.set(false);
                            gVar.f339o = false;
                        } catch (i e3) {
                            com.google.android.gms.internal.auth.g.P("AudioSource", "Retry start AudioStream failed", e3);
                            gVar.f340p = System.nanoTime();
                        }
                    }
                    break;
                }
                j jVar = tVar2;
                if (!gVar.f339o) {
                    jVar = sVar;
                }
                if (tVar.f15993f.get()) {
                    throw new IllegalStateException("The buffer is submitted or canceled.");
                }
                ByteBuffer byteBuffer = tVar.f15990c;
                o oVar = jVar.read(byteBuffer);
                int i = oVar.f373a;
                long j10 = oVar.f374b;
                if (i > 0) {
                    if (gVar.f342r) {
                        byte[] bArr = gVar.f343s;
                        if (bArr == null || bArr.length < i) {
                            gVar.f343s = new byte[i];
                        }
                        int iPosition = byteBuffer.position();
                        byteBuffer.put(gVar.f343s, 0, i);
                        byteBuffer.limit(byteBuffer.position()).position(iPosition);
                    }
                    Executor executor = gVar.f334j;
                    if (executor != null && j10 - gVar.f345u >= 200) {
                        gVar.f345u = j10;
                        x0.v vVar = gVar.f335k;
                        if (gVar.f346v == 2) {
                            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
                            double dMax = ConfigValue.DOUBLE_DEFAULT_VALUE;
                            while (shortBufferAsShortBuffer.hasRemaining()) {
                                dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
                            }
                            gVar.f344t = dMax / 32767.0d;
                            if (vVar != null) {
                                executor.execute(new a0.d(8, gVar, vVar));
                            }
                        }
                    }
                    byteBuffer.limit(byteBuffer.position() + i);
                    tVar.b(TimeUnit.NANOSECONDS.toMicros(j10));
                    tVar.c();
                } else {
                    com.google.android.gms.internal.auth.g.O("AudioSource", "Unable to read data from AudioStream.");
                    tVar.a();
                }
                gVar.c();
                return;
            case 15:
                ((e1.a0) this.f324d).f15894l.f15930o.remove((e1.j) this.f323c);
                return;
            case 22:
                return;
            default:
                ((f0.s) this.f324d).f16553c.k();
                return;
        }
    }

    @Override // b4.m
    public void p() {
        ((MediaCodec) this.f323c).detachOutputSurface();
    }

    @Override // g0.k1
    public int q() {
        return ((i4) this.f323c).q();
    }

    @Override // g0.k1
    public r1 r() {
        return v(((i4) this.f323c).r());
    }

    @Override // b4.m
    public void release() {
        bb.e eVar = (bb.e) this.f324d;
        MediaCodec mediaCodec = (MediaCodec) this.f323c;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && eVar != null) {
                eVar.D(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && eVar != null) {
                eVar.D(mediaCodec);
            }
            mediaCodec.release();
            throw th2;
        }
    }

    @Override // b4.m
    public void s(int i, long j10) {
        ((MediaCodec) this.f323c).releaseOutputBuffer(i, j10);
    }

    @Override // b4.m
    public void setVideoScalingMode(int i) {
        ((MediaCodec) this.f323c).setVideoScalingMode(i);
    }

    @Override // b4.m
    public int t() {
        return ((MediaCodec) this.f323c).dequeueInputBuffer(0L);
    }

    public String toString() {
        switch (this.f322b) {
            case 27:
                return "Bounds{lower=" + ((x1.b) this.f323c) + " upper=" + ((x1.b) this.f324d) + "}";
            default:
                return super.toString();
        }
    }

    @Override // g0.b1
    public c1 u(int i) {
        return J(i);
    }

    public a0.g2 v(r1 r1Var) {
        r2 r2Var;
        if (r1Var == null) {
            return null;
        }
        if (((f0.o) this.f324d) == null) {
            r2Var = r2.f19734b;
        } else {
            f0.o oVar = (f0.o) this.f324d;
            Pair pair = new Pair(oVar.i, oVar.f16537j.get(0));
            r2 r2Var2 = r2.f19734b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            r2Var = new r2(arrayMap);
        }
        this.f324d = null;
        return new a0.g2(r1Var, new Size(r1Var.getWidth(), r1Var.getHeight()), new l0.c(new ob.l((g0.v) null, r2Var, r1Var.x().getTimestamp())));
    }

    @Override // b4.m
    public int w(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f323c).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    public byte[] x(b5.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f324d;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f323c;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f1969a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f1970b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f1971c);
            dataOutputStream.writeLong(aVar.f1972d);
            dataOutputStream.write(aVar.f1973e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    public g2 y() {
        g2 g2Var = new g2();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f324d).entrySet()) {
            u2 u2Var = (u2) entry.getValue();
            if (u2Var.f19782f && u2Var.f19781e) {
                String str = (String) entry.getKey();
                g2Var.a(u2Var.f19777a);
                arrayList.add(str);
            }
        }
        com.google.android.gms.internal.auth.g.e("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + ((String) this.f323c));
        return g2Var;
    }

    public /* synthetic */ e(int i, Object obj, Object obj2, boolean z5) {
        this.f322b = i;
        this.f323c = obj;
        this.f324d = obj2;
    }

    public e(Context context) {
        bb.e eVar;
        this.f322b = 4;
        this.f323c = new bb.h(context, ma.g.f28775b);
        synchronized (bb.e.class) {
            try {
                if (bb.e.f2016f == null) {
                    bb.e.f2016f = new bb.e(context.getApplicationContext(), 0);
                }
                eVar = bb.e.f2016f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f324d = eVar;
    }

    public e(Context context, c5 c5Var) {
        this.f322b = 13;
        ac.c cVar = new ac.c();
        try {
            y8.q.b(context);
            cVar.f739c = y8.q.a().c(w8.a.f35203e).a("PLAY_BILLING_LIBRARY", new v8.c("proto"), new g8.g(12));
        } catch (Throwable unused) {
            cVar.f738b = true;
        }
        this.f324d = cVar;
        this.f323c = c5Var;
    }

    public e(String str, int i) {
        this.f322b = i;
        switch (i) {
            case 25:
                this.f324d = new LinkedHashMap();
                this.f323c = str;
                break;
            default:
                JSONObject jSONObject = new JSONObject(str);
                this.f323c = jSONObject;
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("products");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject != null) {
                            arrayList.add(new d8.v(jSONObjectOptJSONObject));
                        }
                    }
                }
                this.f324d = arrayList;
                break;
        }
    }

    public e(int i) {
        this.f322b = i;
        switch (i) {
            case 6:
                this.f324d = new ArrayList();
                break;
            case 10:
                this.f323c = new ReentrantLock();
                this.f324d = new LinkedHashMap();
                break;
            case 11:
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f323c = byteArrayOutputStream;
                this.f324d = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    @Override // q4.m
    public void j(q4.t tVar) {
    }

    public e(Context context, g8.c cVar) {
        this.f322b = 28;
        this.f323c = context;
        t1.l lVar = new t1.l(context, "geolocator_channel_01");
        lVar.f33363j = 1;
        this.f324d = lVar;
        U(cVar, false);
    }

    public e(f7.b tracker) {
        this.f322b = 19;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        e eVar = new e(10);
        this.f323c = tracker;
        this.f324d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public e(g0.d0 d0Var, b1 b1Var, a2 a2Var) {
        Range rangeD;
        this.f322b = 26;
        this.f323c = b1Var;
        ArrayList arrayListJ = a2Var.j(ExtraSupportedQualityQuirk.class);
        if (arrayListJ.isEmpty()) {
            return;
        }
        ?? map = 0;
        map = 0;
        map = 0;
        f2.g.h(null, arrayListJ.size() == 1);
        ((ExtraSupportedQualityQuirk) arrayListJ.get(0)).getClass();
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            if ("1".equals(d0Var.e()) && !b1Var.k(4)) {
                c1 c1VarU = b1Var.u(1);
                g0.j jVar = (c1VarU == null || c1VarU.d().isEmpty()) ? null : (g0.j) c1VarU.d().get(0);
                if (jVar != null) {
                    h0 h0VarA = i0.a(jVar.f19615b);
                    if (h0VarA != null) {
                        rangeD = h0VarA.d();
                    } else {
                        rangeD = x0.k.f35626e;
                    }
                    Range range = rangeD;
                    Size size = p0.b.f30757d;
                    int i = jVar.f19616c;
                    int i10 = jVar.f19621h;
                    int i11 = jVar.f19617d;
                    g0.i iVarE = g0.i.e(c1VarU.a(), c1VarU.b(), c1VarU.c(), Collections.singletonList(new g0.j(jVar.f19614a, jVar.f19615b, d1.e.d(i, i10, i10, i11, i11, size.getWidth(), jVar.f19618e, size.getHeight(), jVar.f19619f, range), jVar.f19617d, size.getWidth(), size.getHeight(), jVar.f19620g, jVar.f19621h, jVar.i, jVar.f19622j)));
                    map = new HashMap();
                    map.put(4, iVarE);
                    Size sizeA = jVar.a();
                    if (size.getHeight() * size.getWidth() > sizeA.getHeight() * sizeA.getWidth()) {
                        map.put(1, iVarE);
                    }
                }
            }
        } else {
            map = Collections.EMPTY_MAP;
        }
        if (map != 0) {
            this.f324d = new HashMap((Map) map);
        }
    }

    public e(i4 i4Var) {
        this.f322b = 23;
        this.f323c = i4Var;
    }

    public e(fd.g gVar) {
        this.f322b = 1;
        this.f324d = gVar;
    }

    public e(MediaCodec mediaCodec, bb.e eVar) {
        this.f322b = 2;
        this.f323c = mediaCodec;
        this.f324d = eVar;
        if (Build.VERSION.SDK_INT < 35 || eVar == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) eVar.f2021e;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            h5.r(((HashSet) eVar.f2019c).add(mediaCodec));
        }
    }

    public e(e4.m mVar) {
        this.f322b = 16;
        this.f324d = mVar;
        this.f323c = m3.z.o(null);
    }
}
