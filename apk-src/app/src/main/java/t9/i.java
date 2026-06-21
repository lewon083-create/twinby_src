package t9;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.kw0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import ob.b3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff0 f33609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33613f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f33615h;
    public PointF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PointF f33616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kw0 f33617k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33614g = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f33618l = new c(this, 6);

    public i(Context context) {
        this.f33608a = context;
        this.f33615h = ViewConfiguration.get(context).getScaledTouchSlop();
        p9.k kVar = p9.k.C;
        kVar.f31313t.i();
        this.f33617k = (kw0) kVar.f31313t.f28100e;
        this.f33609b = kVar.f31308o.f33632g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z5) {
        if (!z5) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f33614g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f33614g;
        if (i == -1) {
            return;
        }
        c cVar = this.f33618l;
        kw0 kw0Var = this.f33617k;
        if (i == 0) {
            if (actionMasked == 5) {
                this.f33614g = 5;
                this.f33616j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                kw0Var.postDelayed(cVar, ((Long) q9.s.f31967e.f31970c.a(al.H5)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z5 = false;
                for (int i10 = 0; i10 < historySize; i10++) {
                    z5 |= !c(motionEvent.getHistoricalX(0, i10), motionEvent.getHistoricalY(0, i10), motionEvent.getHistoricalX(1, i10), motionEvent.getHistoricalY(1, i10));
                }
                if (c(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z5) {
                    return;
                }
            }
            this.f33614g = -1;
            kw0Var.removeCallbacks(cVar);
        }
    }

    public final void b() {
        String str;
        try {
            Context context = this.f33608a;
            if (!(context instanceof Activity)) {
                u9.i.g("Can not create dialog without Activity Context");
                return;
            }
            p9.k kVar = p9.k.C;
            l lVar = kVar.f31308o;
            synchronized (lVar.f33626a) {
                str = lVar.f33628c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != kVar.f31308o.h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iE = e(arrayList, "Ad information", true);
            final int iE2 = e(arrayList, str2, true);
            final int iE3 = e(arrayList, str3, true);
            boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.f3229ua)).booleanValue();
            final int iE4 = e(arrayList, "Open ad inspector", zBooleanValue);
            final int iE5 = e(arrayList, "Ad inspector settings", zBooleanValue);
            AlertDialog.Builder builderL = g0.l(context);
            builderL.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: t9.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    final i iVar = this.f33546b;
                    ff0 ff0Var = iVar.f33609b;
                    if (i != iE) {
                        if (i == iE2) {
                            u9.i.c("Debug mode [Creative Preview] selected.");
                            hx.f6279a.execute(new c(iVar, 1));
                            return;
                        }
                        if (i == iE3) {
                            u9.i.c("Debug mode [Troubleshooting] selected.");
                            hx.f6279a.execute(new c(iVar, 2));
                            return;
                        }
                        if (i == iE4) {
                            gx gxVar = hx.f6284f;
                            gx gxVar2 = hx.f6279a;
                            if (ff0Var.f()) {
                                gxVar.execute(new c(iVar, 5));
                                return;
                            } else {
                                gxVar2.execute(new s9.i(4, iVar, gxVar));
                                return;
                            }
                        }
                        if (i == iE5) {
                            gx gxVar3 = hx.f6284f;
                            gx gxVar4 = hx.f6279a;
                            if (ff0Var.f()) {
                                gxVar3.execute(new c(iVar, 0));
                                return;
                            } else {
                                gxVar4.execute(new b3(8, iVar, gxVar3, false));
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = iVar.f33608a;
                    if (!(context2 instanceof Activity)) {
                        u9.i.g("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = iVar.f33610c;
                    final String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb2 = new StringBuilder();
                        g0 g0Var = p9.k.C.f31297c;
                        HashMap mapP = g0.p(uriBuild);
                        for (String str6 : mapP.keySet()) {
                            sb2.append(str6);
                            sb2.append(" = ");
                            sb2.append((String) mapP.get(str6));
                            sb2.append("\n\n");
                        }
                        String strTrim = sb2.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str5 = strTrim;
                        }
                    }
                    g0 g0Var2 = p9.k.C.f31297c;
                    AlertDialog.Builder builderL2 = g0.l(context2);
                    builderL2.setMessage(str5);
                    builderL2.setTitle("Ad Information");
                    builderL2.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: t9.g
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i10) {
                            i iVar2 = iVar;
                            iVar2.getClass();
                            g0 g0Var3 = p9.k.C.f31297c;
                            g0.u(iVar2.f33608a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str5), "Share via"));
                        }
                    });
                    builderL2.setNegativeButton("Close", h.f33607b);
                    builderL2.create().show();
                }
            });
            builderL.create().show();
        } catch (WindowManager.BadTokenException e3) {
            c0.n("", e3);
        }
    }

    public final boolean c(float f10, float f11, float f12, float f13) {
        float fAbs = Math.abs(this.i.x - f10);
        int i = this.f33615h;
        return fAbs < ((float) i) && Math.abs(this.i.y - f11) < ((float) i) && Math.abs(this.f33616j.x - f12) < ((float) i) && Math.abs(this.f33616j.y - f13) < ((float) i);
    }

    public final void d(Context context) {
        ArrayList arrayList = new ArrayList();
        int iE = e(arrayList, "None", true);
        final int iE2 = e(arrayList, "Shake", true);
        final int iE3 = e(arrayList, "Flick", true);
        int iOrdinal = this.f33609b.f5354r.ordinal();
        final int i = iOrdinal != 1 ? iOrdinal != 2 ? iE : iE3 : iE2;
        g0 g0Var = p9.k.C.f31297c;
        AlertDialog.Builder builderL = g0.l(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderL.setTitle("Setup gesture");
        builderL.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new d(0, atomicInteger));
        builderL.setNegativeButton("Dismiss", new d(1, this));
        builderL.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: t9.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                i iVar = this.f33559b;
                ff0 ff0Var = iVar.f33609b;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i) {
                    if (atomicInteger2.get() == iE2) {
                        ff0Var.h(cf0.f4195c, true);
                    } else if (atomicInteger2.get() == iE3) {
                        ff0Var.h(cf0.f4196d, true);
                    } else {
                        ff0Var.h(cf0.f4194b, true);
                    }
                }
                iVar.b();
            }
        });
        builderL.setOnCancelListener(new f(0, this));
        builderL.create().show();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f33610c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f33613f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f33612e);
        sb2.append(",Ad Unit ID: ");
        return a0.u.o(sb2, this.f33611d, "}");
    }
}
