package xi;

import android.os.StatFs;
import android.util.Log;
import android.view.View;
import com.google.firebase.messaging.y;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t.t0;
import z2.d0;
import z2.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements h2.q, d8.s, f.b, ii.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f36218b;

    public /* synthetic */ d(Object obj) {
        this.f36218b = obj;
    }

    @Override // ii.f
    public void b(String str, ii.d dVar, t0 t0Var) {
        ((zh.h) this.f36218b).b(str, dVar, t0Var);
    }

    @Override // h2.q
    public boolean c(View view) {
        y yVar = (y) this.f36218b;
        int currentItem = ((y6.m) view).getCurrentItem() + 1;
        y6.m mVar = (y6.m) yVar.f14902e;
        if (mVar.f36523s) {
            mVar.c(currentItem, true);
        }
        return true;
    }

    @Override // ii.f
    public void d(String str, ii.d dVar) {
        ((zh.h) this.f36218b).b(str, dVar, null);
    }

    @Override // f.b
    public void e(Object obj) {
        f.a aVar = (f.a) obj;
        h0 h0Var = (h0) this.f36218b;
        d0 d0Var = (d0) h0Var.E.pollFirst();
        if (d0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = d0Var.f45824b;
        int i = d0Var.f45825c;
        z2.t tVarW = h0Var.f45844c.w(str);
        if (tVarW != null) {
            tVarW.t(i, aVar.f16447b, aVar.f16448c);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // ii.f
    public void f(String str, ByteBuffer byteBuffer) {
        ((zh.h) this.f36218b).g(str, byteBuffer, null);
    }

    @Override // ii.f
    public void g(String str, ByteBuffer byteBuffer, ii.e eVar) {
        ((zh.h) this.f36218b).g(str, byteBuffer, eVar);
    }

    @Override // ii.f
    public t0 h(ii.l lVar) {
        return ((zh.h) this.f36218b).h(lVar);
    }

    public long i() {
        x0.m mVar = (x0.m) this.f36218b;
        try {
            if (!(mVar instanceof x0.m)) {
                throw new AssertionError("Unknown OutputOptions: " + mVar);
            }
            File file = mVar.f35649b.f35572c.getParentFile();
            Intrinsics.b(file);
            Intrinsics.checkNotNullParameter(file, "file");
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            Intrinsics.checkNotNullParameter(path, "path");
            return new StatFs(path).getAvailableBytes();
        } catch (RuntimeException e3) {
            com.google.android.gms.internal.auth.g.P("OutputStorageImpl", "Fail to access the available bytes.", e3);
            return Long.MAX_VALUE;
        }
    }

    @Override // d8.s
    public void onPurchasesUpdated(d8.j jVar, List list) {
        yi.l lVarH = ya.e.h(jVar);
        List listI = ya.e.i(list);
        m4.d dVar = (m4.d) this.f36218b;
        yi.y yVar = new yi.y();
        yVar.f45746a = lVarH;
        if (listI == null) {
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }
        yVar.f45747b = listI;
        ti.t tVar = new ti.t(10);
        dVar.getClass();
        String str = "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated";
        new s7.g((ii.f) dVar.f28630b, str, yi.d.f45645a, (Object) null).K(new ArrayList(Collections.singletonList(yVar)), new oi.i(24, tVar, str));
    }

    public d(x0.m outputOptions) {
        Intrinsics.checkNotNullParameter(outputOptions, "outputOptions");
        this.f36218b = outputOptions;
    }

    public d() {
        this.f36218b = new y3.d(5, 1.0f, false);
    }
}
