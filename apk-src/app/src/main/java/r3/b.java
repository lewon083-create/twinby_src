package r3;

import android.content.Context;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Surface;
import android.widget.EditText;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.lifecycle.d0;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.ads.p5;
import com.google.android.gms.internal.ads.s00;
import com.google.android.gms.internal.ads.ta;
import com.google.android.gms.internal.ads.ua;
import com.google.android.gms.internal.ads.y50;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.y;
import d8.u;
import e1.c0;
import g0.e0;
import g0.m0;
import g0.n0;
import g0.r2;
import g0.v;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k9.o;
import kotlin.jvm.internal.Intrinsics;
import l6.j;
import m3.z;
import n5.m;
import t9.g0;
import t9.s;
import t9.x;
import u.t;
import u2.k;
import u2.q;
import vc.i;
import vl.p;
import w2.h;
import x0.b0;
import xl.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class b implements xc.g, v, k0.c, ta, u9.c, o, OnCompleteListener, yc.g, n, m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f32188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f32189d;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f32187b = i;
        this.f32188c = obj;
        this.f32189d = obj2;
    }

    public static void l(b bVar, s3.b bVar2) {
        bVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) bVar.f32188c).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!t(bVar2, list).equals(t((s3.b) bVar.f32189d, list))) {
                throw null;
            }
        }
        bVar.f32189d = bVar2;
    }

    public static s3.b t(s3.b bVar, List list) {
        bVar.getClass();
        Map map = bVar.f32452a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new s3.b(map2);
    }

    public static boolean u(Editable editable, KeyEvent keyEvent, boolean z5) {
        q[] qVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (qVarArr = (q[]) editable.getSpans(selectionStart, selectionEnd, q.class)) != null && qVarArr.length > 0) {
                for (q qVar : qVarArr) {
                    int spanStart = editable.getSpanStart(qVar);
                    int spanEnd = editable.getSpanEnd(qVar);
                    if ((z5 && spanStart == selectionStart) || ((!z5 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public ArrayList A(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f32188c;
        j jVarD = j.d(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            jVarD.i(1);
        } else {
            jVarD.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            jVarD.k();
        }
    }

    public boolean B(CharSequence charSequence, int i, int i10, k kVar) {
        if (kVar.f34043c == 0) {
            u2.e eVar = (u2.e) this.f32189d;
            v2.a aVarB = kVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f19839e).getShort(iA + aVarB.f19836b);
            }
            u2.c cVar = (u2.c) eVar;
            cVar.getClass();
            ThreadLocal threadLocal = u2.c.f34025b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i < i10) {
                sb2.append(charSequence.charAt(i));
                i++;
            }
            kVar.f34043c = cVar.f34026a.hasGlyph(sb2.toString()) ? 2 : 1;
        }
        return kVar.f34043c == 2;
    }

    public void C(u7.c cVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f32188c;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((u7.b) this.f32189d).e(cVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public void D(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws u.a {
        executor.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.f32188c).openCamera(str, new t.v(executor, stateCallback), ((t) this.f32189d).f33979b);
        } catch (CameraAccessException e3) {
            throw new u.a(e3);
        }
    }

    public void E(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        u.o oVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        t tVar = (t) this.f32189d;
        synchronized (tVar.f33978a) {
            try {
                oVar = (u.o) tVar.f33978a.get(availabilityCallback);
                if (oVar == null) {
                    oVar = new u.o(executor, availabilityCallback);
                    tVar.f33978a.put(availabilityCallback, oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((CameraManager) this.f32188c).registerAvailabilityCallback(oVar, tVar.f33979b);
    }

    public sb.m F() {
        String str;
        uc.g gVar = (uc.g) this.f32188c;
        String str2 = gVar.f34454b;
        u uVar = uc.g.f34452c;
        uVar.c("requestInAppReview (%s)", str2);
        i iVar = gVar.f34453a;
        if (iVar != null) {
            sb.g gVar2 = new sb.g();
            iVar.a().post(new vc.g(iVar, gVar2, gVar2, new uc.e(gVar, gVar2, gVar2)));
            return gVar2.f32858a;
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", u.e(uVar.f15702c, "Play Store app is either not installed or not the official version", objArr));
        }
        Locale locale = Locale.getDefault();
        HashMap map = wc.a.f35229a;
        if (map.containsKey(-1)) {
            str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) wc.a.f35230b.get(-1)) + ")";
        } else {
            str = "";
        }
        return b4.q(new uc.a(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null)));
    }

    public int G(List list, j0.i iVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f32188c).setRepeatingBurst(list, new t.m(iVar, captureCallback), ((u.g) this.f32189d).f33960a);
    }

    public int H(CaptureRequest captureRequest, j0.i iVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f32188c).setRepeatingRequest(captureRequest, new t.m(iVar, captureCallback), ((u.g) this.f32189d).f33960a);
    }

    public void I(CameraManager.AvailabilityCallback availabilityCallback) {
        u.o oVar;
        if (availabilityCallback != null) {
            t tVar = (t) this.f32189d;
            synchronized (tVar.f33978a) {
                oVar = (u.o) tVar.f33978a.remove(availabilityCallback);
            }
        } else {
            oVar = null;
        }
        if (oVar != null) {
            synchronized (oVar.f33974c) {
                oVar.f33975d = true;
            }
        }
        ((CameraManager) this.f32188c).unregisterAvailabilityCallback(oVar);
    }

    public void J(e0 e0Var, a0.g gVar) {
        a0.f fVar;
        a0.f fVar2;
        if (gVar == null || gVar.f83a != 8) {
            switch (e0Var) {
                case RELEASED:
                case CLOSED:
                    fVar = new a0.f(5, gVar);
                    break;
                case RELEASING:
                case CLOSING:
                    fVar = new a0.f(4, gVar);
                    break;
                case PENDING_OPEN:
                    n0 n0Var = (n0) this.f32188c;
                    synchronized (n0Var.f19685b) {
                        Iterator it = n0Var.f19688e.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                fVar2 = new a0.f(1, null);
                            } else if (((m0) ((Map.Entry) it.next()).getValue()).f19654a == e0.CLOSING) {
                                fVar2 = new a0.f(2, null);
                            }
                        }
                    }
                    fVar = fVar2;
                    break;
                case OPENING:
                    fVar = new a0.f(2, gVar);
                    break;
                case OPEN:
                case CONFIGURED:
                    fVar = new a0.f(3, gVar);
                    break;
                default:
                    throw new IllegalStateException("Unknown internal camera state: " + e0Var);
            }
        } else {
            fVar = new a0.f(5, gVar);
        }
        com.google.android.gms.internal.auth.g.e("CameraStateMachine", "New public camera state " + fVar + " from " + e0Var + " and " + gVar);
        if (Objects.equals((a0.f) ((d0) this.f32189d).d(), fVar)) {
            return;
        }
        com.google.android.gms.internal.auth.g.e("CameraStateMachine", "Publishing new public camera state " + fVar);
        ((d0) this.f32189d).i(fVar);
    }

    @Override // xc.h
    public Object a() {
        return new sc.f(((ti.b) this.f32188c).f33798b, (xc.n) ((xc.f) this.f32189d).a(), new sc.c(4));
    }

    @Override // u9.c
    public u9.k b(String str) {
        int i = this.f32187b;
        u9.k kVar = u9.k.f34393b;
        switch (i) {
            case 11:
                t9.d0 d0Var = g0.f33596l;
                g0 g0Var = p9.k.C.f31297c;
                new x((Context) this.f32188c, (String) this.f32189d, str, null).B();
                break;
            default:
                new s00((u9.d) this.f32188c, (Context) this.f32189d, str).start();
                break;
        }
        return kVar;
    }

    @Override // g0.v
    public r2 c() {
        return (r2) this.f32188c;
    }

    @Override // g0.v
    public int d() {
        Integer num = (Integer) ((CaptureResult) this.f32189d).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return 2;
        }
        if (iIntValue == 2) {
            return 3;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return 4;
        }
        com.google.android.gms.internal.auth.g.k("C2CameraCaptureResult", "Undefined flash state: " + num);
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ta
    public void e(ua uaVar) {
        String str = (String) this.f32188c;
        String string = uaVar.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb2.append("Failed to load URL: ");
        sb2.append(str);
        sb2.append("\n");
        sb2.append(string);
        u9.i.h(sb2.toString());
        ((s) this.f32189d).b(null);
    }

    @Override // yc.g
    public void f(com.google.android.gms.internal.consent_sdk.k kVar) {
        ((vi.c) ((s7.g) this.f32189d).f32795b).f34865a.put(Integer.valueOf(kVar.hashCode()), kVar);
        ((hi.g) this.f32188c).success(kVar);
    }

    @Override // xl.n
    public void g(p pVar, int i) {
        if (pVar.o().equals("#text")) {
            return;
        }
        try {
            pVar.r((StringBuilder) this.f32188c, i, (vl.g) this.f32189d);
        } catch (IOException e3) {
            throw new oc(e3);
        }
    }

    @Override // g0.v
    public long getTimestamp() {
        Long l10 = (Long) ((CaptureResult) this.f32189d).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // g0.v
    public g0.u h() {
        Integer num = (Integer) ((CaptureResult) this.f32189d).get(CaptureResult.CONTROL_AWB_STATE);
        g0.u uVar = g0.u.f19766b;
        if (num == null) {
            return uVar;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return g0.u.f19767c;
        }
        if (iIntValue == 1) {
            return g0.u.f19768d;
        }
        if (iIntValue == 2) {
            return g0.u.f19769e;
        }
        if (iIntValue == 3) {
            return g0.u.f19770f;
        }
        com.google.android.gms.internal.auth.g.k("C2CameraCaptureResult", "Undefined awb state: " + num);
        return uVar;
    }

    @Override // xl.n
    public void j(p pVar, int i) {
        try {
            pVar.q((StringBuilder) this.f32188c, i, (vl.g) this.f32189d);
        } catch (IOException e3) {
            throw new oc(e3);
        }
    }

    @Override // g0.v
    public g0.s k() {
        Integer num = (Integer) ((CaptureResult) this.f32189d).get(CaptureResult.CONTROL_AE_STATE);
        g0.s sVar = g0.s.f19736b;
        if (num == null) {
            return sVar;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return g0.s.f19737c;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return g0.s.f19740f;
            }
            if (iIntValue == 3) {
                return g0.s.f19741g;
            }
            if (iIntValue == 4) {
                return g0.s.f19739e;
            }
            if (iIntValue != 5) {
                com.google.android.gms.internal.auth.g.k("C2CameraCaptureResult", "Undefined ae state: " + num);
                return sVar;
            }
        }
        return g0.s.f19738d;
    }

    @Override // g0.v
    public CaptureResult m() {
        return (CaptureResult) this.f32189d;
    }

    @Override // g0.v
    public g0.t n() {
        Integer num = (Integer) ((CaptureResult) this.f32189d).get(CaptureResult.CONTROL_AF_STATE);
        g0.t tVar = g0.t.f19756b;
        if (num == null) {
            return tVar;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                com.google.android.gms.internal.auth.g.k("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return tVar;
    }

    public void o() {
        bb.e eVar = (bb.e) this.f32188c;
        if (eVar != null) {
            ((AtomicBoolean) eVar.f2020d).set(true);
            ((ScheduledFuture) eVar.f2019c).cancel(true);
        }
        this.f32188c = null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        i iVar = (i) this.f32188c;
        sb.g gVar = (sb.g) this.f32189d;
        synchronized (iVar.f34849f) {
            iVar.f34848e.remove(gVar);
        }
    }

    @Override // k0.c
    public void onFailure(Throwable th2) {
        switch (this.f32187b) {
            case 8:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
            default:
                com.google.android.gms.internal.auth.g.e("Recorder", "Error in ReadyToReleaseFuture: " + th2);
                return;
        }
    }

    @Override // k0.c
    public void onSuccess(Object obj) {
        c0 c0Var;
        switch (this.f32187b) {
            case 8:
                ((Surface) this.f32188c).release();
                ((SurfaceTexture) this.f32189d).release();
                break;
            default:
                e1.m mVar = (e1.m) obj;
                b0 b0Var = (b0) this.f32189d;
                com.google.android.gms.internal.auth.g.e("Recorder", "VideoEncoder can be released: " + mVar);
                if (mVar != null) {
                    ScheduledFuture scheduledFuture = b0Var.Z;
                    if (scheduledFuture != null && scheduledFuture.cancel(false) && (c0Var = b0Var.G) != null && c0Var == mVar) {
                        b0.r(c0Var);
                    }
                    b0Var.f35534d0 = (y50) this.f32188c;
                    b0Var.C(null);
                    b0Var.v(b0Var.o());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // n5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(byte[] r19, int r20, int r21, n5.l r22, m3.g r23) {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.b.p(byte[], int, int, n5.l, m3.g):void");
    }

    public int q(List list, j0.i iVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f32188c).captureBurst(list, new t.m(iVar, captureCallback), ((u.g) this.f32189d).f33960a);
    }

    public void r() {
        this.f32188c = null;
        this.f32189d = null;
    }

    @Override // n5.m
    public int s() {
        return 1;
    }

    public u3.c v(j3.o oVar, j3.d dVar) {
        boolean zBooleanValue;
        oVar.getClass();
        int i = oVar.G;
        dVar.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i == -1) {
            return u3.c.f34081d;
        }
        Context context = (Context) this.f32188c;
        Boolean bool = (Boolean) this.f32189d;
        boolean z5 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = k3.f.n(context).getParameters("offloadVariableRateSupported");
                this.f32189d = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f32189d = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) this.f32189d).booleanValue();
        }
        String str = oVar.f26335n;
        str.getClass();
        int iC = j3.c0.c(str, oVar.f26332k);
        if (iC == 0 || i10 < z.q(iC)) {
            return u3.c.f34081d;
        }
        int iR = z.r(oVar.F);
        if (iR == 0) {
            return u3.c.f34081d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iR).setEncoding(iC).build();
            if (i10 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, dVar.a())) {
                    return u3.c.f34081d;
                }
                p5 p5Var = new p5();
                p5Var.f8926a = true;
                p5Var.f8928c = zBooleanValue;
                return p5Var.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, dVar.a());
            if (playbackOffloadSupport == 0) {
                return u3.c.f34081d;
            }
            p5 p5Var2 = new p5();
            if (i10 > 32 && playbackOffloadSupport == 2) {
                z5 = true;
            }
            p5Var2.f8926a = true;
            p5Var2.f8927b = z5;
            p5Var2.f8928c = zBooleanValue;
            return p5Var2.a();
        } catch (IllegalArgumentException unused) {
            return u3.c.f34081d;
        }
    }

    public CameraCharacteristics w(String str) throws u.a {
        try {
            return ((CameraManager) this.f32188c).getCameraCharacteristics(str);
        } catch (CameraAccessException e3) {
            throw new u.a(e3);
        }
    }

    public Set x() {
        return Collections.EMPTY_SET;
    }

    public ArrayList y(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f32188c;
        j jVarD = j.d(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            jVarD.i(1);
        } else {
            jVarD.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            jVarD.k();
        }
    }

    public Long z(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f32188c;
        j jVarD = j.d(1, "SELECT long_value FROM Preference where `key`=?");
        jVarD.j(1, str);
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(jVarD);
        try {
            Long lValueOf = null;
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                lValueOf = Long.valueOf(cursorG.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorG.close();
            jVarD.k();
        }
    }

    public /* synthetic */ b(int i, Object obj, Object obj2, boolean z5) {
        this.f32187b = i;
        this.f32189d = obj;
        this.f32188c = obj2;
    }

    public /* synthetic */ b(int i, boolean z5) {
        this.f32187b = i;
    }

    public b(ti.b bVar, xc.f fVar, sc.c cVar) {
        this.f32187b = 4;
        this.f32188c = bVar;
        this.f32189d = fVar;
    }

    public b(t9.u uVar, String str, s sVar) {
        this.f32187b = 10;
        this.f32188c = str;
        this.f32189d = sVar;
    }

    public b(uc.g gVar) {
        this.f32187b = 22;
        this.f32189d = new Handler(Looper.getMainLooper());
        this.f32188c = gVar;
    }

    public b(WorkDatabase_Impl workDatabase_Impl, int i) {
        this.f32187b = i;
        switch (i) {
            case 18:
                this.f32188c = workDatabase_Impl;
                this.f32189d = new u7.b(workDatabase_Impl, 1);
                break;
            case 19:
                this.f32188c = workDatabase_Impl;
                this.f32189d = new u7.b(workDatabase_Impl, 3);
                break;
            case 20:
                this.f32188c = workDatabase_Impl;
                this.f32189d = new u7.b(workDatabase_Impl, 6);
                break;
            default:
                this.f32188c = workDatabase_Impl;
                this.f32189d = new u7.b(workDatabase_Impl, 0);
                break;
        }
    }

    @Override // g0.v
    public void a(i0.k kVar) {
        String strValueOf;
        CaptureResult captureResult = (CaptureResult) this.f32189d;
        super.a(kVar);
        ArrayList arrayList = kVar.f20787a;
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                kVar.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            com.google.android.gms.internal.auth.g.O("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        if (((Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
            kVar.c("ExposureTime", String.valueOf(r2.longValue() / TimeUnit.SECONDS.toNanos(1L)), arrayList);
        }
        Float f10 = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            kVar.c("FNumber", String.valueOf(f10.floatValue()), arrayList);
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (((Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (r3.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            kVar.c("SensitivityType", String.valueOf(3), arrayList);
            kVar.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
        }
        Float f11 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            kVar.c("FocalLength", ((long) (f11.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            int iM = t.z.m(num2.intValue() == 0 ? 2 : 1);
            if (iM != 0) {
                strValueOf = iM != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            kVar.c("WhiteBalance", strValueOf, arrayList);
        }
    }

    public b(j0.i executor) {
        this.f32187b = 9;
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f32188c = executor;
        this.f32189d = new AtomicInteger(0);
    }

    public b(CameraCaptureSession cameraCaptureSession, u.g gVar) {
        this.f32187b = 13;
        cameraCaptureSession.getClass();
        this.f32188c = cameraCaptureSession;
        this.f32189d = gVar;
    }

    public b(n0 n0Var) {
        this.f32187b = 7;
        this.f32188c = n0Var;
        d0 d0Var = new d0();
        this.f32189d = d0Var;
        d0Var.i(new a0.f(5, null));
    }

    public b(Context context, t tVar) {
        this.f32187b = 14;
        this.f32188c = (CameraManager) context.getSystemService("camera");
        this.f32189d = tVar;
    }

    public b(String str) {
        this.f32187b = 28;
        this.f32188c = (ExtraSupportedOutputSizeQuirk) w.a.f34941a.i(ExtraSupportedOutputSizeQuirk.class);
        this.f32189d = new ba.a(str);
    }

    public b(Context context) {
        this.f32187b = 16;
        this.f32188c = context == null ? null : context.getApplicationContext();
    }

    public b(y yVar, ti.t tVar, u2.c cVar) {
        this.f32187b = 15;
        this.f32188c = yVar;
        this.f32189d = cVar;
    }

    public b(MediaCodec.CryptoInfo cryptoInfo) {
        this.f32187b = 0;
        this.f32188c = cryptoInfo;
        this.f32189d = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public b(EditText editText) {
        this.f32187b = 26;
        this.f32188c = editText;
        h hVar = new h(editText);
        this.f32189d = hVar;
        editText.addTextChangedListener(hVar);
        if (w2.a.f35001b == null) {
            synchronized (w2.a.f35000a) {
                try {
                    if (w2.a.f35001b == null) {
                        w2.a aVar = new w2.a();
                        try {
                            w2.a.f35002c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, w2.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        w2.a.f35001b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(w2.a.f35001b);
    }

    public b(t.c0 c0Var) {
        this.f32187b = 6;
        this.f32189d = c0Var;
        this.f32188c = null;
    }

    public b(int i) {
        this.f32187b = i;
        switch (i) {
            case 27:
                this.f32188c = new m3.p();
                this.f32189d = new w5.a();
                break;
            default:
                this.f32188c = new HashMap();
                this.f32189d = s3.b.f32451b;
                break;
        }
    }
}
