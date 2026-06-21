package m4;

import aj.w;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import fj.z;
import g0.a2;
import g2.n0;
import g2.t1;
import g2.x1;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Message;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import ob.d4;
import ob.l1;
import ob.s0;
import ob.z3;
import z2.d0;
import z2.h0;
import z2.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class d implements ed.b, d4, kk.e, p2.c, g2.q, sb.a, u9.e, yc.f, v3.g, h2.q, f.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f28630b;

    public /* synthetic */ d(Object obj) {
        this.f28630b = obj;
    }

    @Override // v3.g
    public long D(long j10, long j11) {
        return 0L;
    }

    @Override // v3.g
    public boolean N() {
        return true;
    }

    @Override // v3.g
    public long Q() {
        return 0L;
    }

    @Override // v3.g
    public long S(long j10) {
        return 1L;
    }

    @Override // v3.g
    public long T(long j10, long j11) {
        return 1L;
    }

    @Override // yc.f
    public void a(yc.e eVar) {
        ((hi.g) this.f28630b).b(Integer.toString(eVar.f45612a), eVar.f45613b, null);
    }

    @Override // v3.g
    public long b(long j10) {
        return 0L;
    }

    @Override // h2.q
    public boolean c(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f28630b;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        Field field = n0.f19900a;
        boolean z5 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f14479d;
        view.offsetLeftAndRight((!(i == 0 && z5) && (i != 1 || z5)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p2.c
    public Object d(p2.b bVar) {
        return ((od.a) this.f28630b).invoke(bVar);
    }

    @Override // f.b
    public void e(Object obj) {
        f.a aVar = (f.a) obj;
        h0 h0Var = (h0) this.f28630b;
        d0 d0Var = (d0) h0Var.E.pollLast();
        if (d0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = d0Var.f45824b;
        int i = d0Var.f45825c;
        t tVarW = h0Var.f45844c.w(str);
        if (tVarW != null) {
            tVarW.t(i, aVar.f16447b, aVar.f16448c);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // sb.a
    public /* bridge */ /* synthetic */ Object g(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) this.f28630b);
        return b4.s(arrayList);
    }

    @Override // ob.d4
    public void g0(String str, String str2, Bundle bundle) {
        z3 z3Var = (z3) this.f28630b;
        if (!TextUtils.isEmpty(str)) {
            z3Var.e().L(new aa.b(this, str, str2, bundle));
            return;
        }
        l1 l1Var = z3Var.f30615m;
        if (l1Var != null) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.g(str2, "AppId not known when logging event");
        }
    }

    public int h() {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f28630b;
        return Math.max(0, (sideSheetBehavior.f14655m - sideSheetBehavior.f14654l) - sideSheetBehavior.f14656n);
    }

    public void i() {
        long j10;
        v3.f fVar = (v3.f) this.f28630b;
        synchronized (n4.b.f29098b) {
            try {
                j10 = n4.b.f29099c ? n4.b.f29100d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        fVar.L = j10;
        fVar.B(true);
    }

    public boolean k() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) this.f28630b;
        boolean z5 = false;
        if (torchFlashRequiredFor3aUpdateQuirk != null) {
            if (!(Build.VERSION.SDK_INT >= 28 && t.o.v(torchFlashRequiredFor3aUpdateQuirk.f1249a, 5) == 5)) {
                z5 = true;
            }
        }
        com.google.android.gms.internal.auth.g.e("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z5);
        return z5;
    }

    @Override // g2.q
    public x1 l(View view, x1 x1Var) {
        t1 t1Var = x1Var.f19943a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f28630b;
        if (!Objects.equals(coordinatorLayout.f1308o, x1Var)) {
            coordinatorLayout.f1308o = x1Var;
            boolean z5 = x1Var.d() > 0;
            coordinatorLayout.f1309p = z5;
            coordinatorLayout.setWillNotDraw(!z5 && coordinatorLayout.getBackground() == null);
            if (!t1Var.q()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    Field field = n0.f19900a;
                    if (childAt.getFitsSystemWindows() && ((r1.d) childAt.getLayoutParams()).f32156a != null && t1Var.q()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return x1Var;
    }

    @Override // v3.g
    public long m(long j10, long j11) {
        return 0L;
    }

    @Override // v3.g
    public long n(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // v3.g
    public w3.j o(long j10) {
        return (w3.j) this.f28630b;
    }

    @Override // ed.b, k0.c
    public void onFailure(Throwable th2) {
        ni.l1.b((z) this.f28630b, th2);
    }

    @Override // ed.b, k0.c
    public void onSuccess(Object obj) {
        ni.l1.c(null, (z) this.f28630b);
    }

    @Override // kk.e
    public Object p(kk.f fVar, mj.a aVar) {
        Object objP = ((h3.e) this.f28630b).p(new w(fVar, 1), aVar);
        return objP == nj.a.f29512b ? objP : Unit.f27471a;
    }

    @Override // u9.e
    public void q(JsonWriter jsonWriter) throws IOException {
        Object obj = u9.f.f34380b;
        jsonWriter.name(Message.JsonKeys.PARAMS).beginObject();
        byte[] bArr = (byte[]) this.f28630b;
        int length = bArr.length;
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name(SentryLogEvent.JsonKeys.BODY).value(strEncodeToString);
        } else {
            String strD = u9.d.d(strEncodeToString, "MD5");
            if (strD != null) {
                jsonWriter.name("bodydigest").value(strD);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    public d(a2 a2Var, int i) {
        switch (i) {
            case 22:
                this.f28630b = (TorchFlashRequiredFor3aUpdateQuirk) a2Var.i(TorchFlashRequiredFor3aUpdateQuirk.class);
                break;
            default:
                this.f28630b = (CaptureSessionOnClosedNotCalledQuirk) a2Var.i(CaptureSessionOnClosedNotCalledQuirk.class);
                break;
        }
    }

    public d(int i) {
        switch (i) {
            case 20:
                this.f28630b = new ConcurrentHashMap(16);
                break;
            default:
                this.f28630b = new CopyOnWriteArrayList();
                break;
        }
    }

    @Override // v3.g
    public long f(long j10, long j11) {
        return j11;
    }
}
