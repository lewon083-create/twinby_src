package m7;

import a0.o2;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraDevice;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.nativead.AdChoicesView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.ct;
import com.google.android.gms.internal.ads.fo;
import com.google.android.gms.internal.ads.i8;
import com.google.android.gms.internal.ads.jx;
import com.google.android.gms.internal.ads.o00;
import com.google.android.gms.internal.ads.sz;
import com.google.android.gms.internal.ads.ta;
import com.google.android.gms.internal.ads.ua;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.measurement.h5;
import com.twinby.R;
import fj.z;
import io.flutter.view.p;
import io.sentry.MeasurementUnit;
import io.sentry.protocol.Request;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kk.t;
import kotlin.jvm.internal.Intrinsics;
import ob.d4;
import ob.k2;
import ob.l1;
import ob.t0;
import ob.z3;
import p2.w0;
import p2.x0;
import p3.x;
import pa.o;
import q9.w2;
import t.h1;
import ti.j0;
import vl.r;
import wl.d0;
import xh.e0;
import xh.f0;
import xl.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ed.b, p, d4, t0, oe.k, oa.m, o00, xc.g, k0.c, ta, z9.a, n, n5.m, e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f28696c;

    public /* synthetic */ a(int i, Object obj) {
        this.f28695b = i;
        this.f28696c = obj;
    }

    public static x3.b m(wa.a aVar) {
        new x();
        aVar.getClass();
        new HashMap();
        throw null;
    }

    public static ArrayList o(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add(MeasurementUnit.NONE);
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add(Request.JsonKeys.OTHER);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(MeasurementUnit.NONE);
        }
        return arrayList;
    }

    @Override // xc.h
    public /* bridge */ /* synthetic */ Object a() {
        return new sc.b((sc.f) ((xc.f) this.f28696c).a());
    }

    @Override // oa.m
    public void accept(Object obj, Object obj2) {
        Parcel parcelObtain;
        int i = this.f28695b;
        Object obj3 = this.f28696c;
        switch (i) {
            case 14:
                sb.g gVar = (sb.g) obj2;
                ra.a aVar = (ra.a) ((ra.c) obj).n();
                o oVar = (o) obj3;
                parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(aVar.f2257d);
                int i10 = db.a.f15734a;
                if (oVar == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    oVar.writeToParcel(parcelObtain, 0);
                }
                try {
                    aVar.f2256c.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                    gVar.b(null);
                    return;
                } finally {
                }
            default:
                tb.k kVar = (tb.k) obj3;
                jb.a aVar2 = (jb.a) obj;
                Bundle bundleX = aVar2.x();
                bundleX.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                jb.b bVar = new jb.b(1, (sb.g) obj2);
                try {
                    jb.i iVar = (jb.i) aVar2.n();
                    parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i11 = jb.c.f26595a;
                    parcelObtain.writeInt(1);
                    kVar.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeInt(1);
                    bundleX.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(bVar);
                    try {
                        iVar.f26603b.transact(19, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } finally {
                    }
                } catch (RemoteException e3) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e3);
                    Bundle bundle = Bundle.EMPTY;
                    bVar.b2(Status.f2631h, null);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.o00
    public /* synthetic */ void b(int i, String str, String str2, boolean z5) {
        sz szVar = ((s9.d) this.f28696c).f32810e;
        if (szVar != null) {
            szVar.t0();
        }
    }

    @Override // io.flutter.view.p
    public void c() {
        o2 o2Var = (o2) this.f28696c;
        o2Var.d();
        o2Var.f187k.b(null);
    }

    @Override // com.google.android.gms.internal.ads.ta
    public void e(ua uaVar) {
        ((jx) this.f28696c).d(uaVar);
    }

    @Override // z9.a
    public void f(ct ctVar) {
        fo foVar;
        ka.k kVar;
        int i;
        j0 j0Var;
        ct nativeAd = ctVar;
        fo foVar2 = nativeAd.f4306a;
        ut utVar = nativeAd.f4308c;
        WeakReference weakReference = (WeakReference) this.f28696c;
        if (weakReference.get() != null) {
            j0 j0Var2 = (j0) weakReference.get();
            ka.k kVar2 = j0Var2.f33835b;
            ui.b bVar = j0Var2.f33842j;
            if (bVar != null) {
                TemplateView templateView = (TemplateView) ((LayoutInflater) j0Var2.f33844l.getSystemService("layout_inflater")).inflate(bVar.f34479a.f34491b, (ViewGroup) null);
                ui.c cVar = bVar.f34484f;
                ui.c cVar2 = bVar.f34483e;
                ui.c cVar3 = bVar.f34482d;
                ui.c cVar4 = bVar.f34481c;
                u8.a aVar = new u8.a();
                ColorDrawable colorDrawable = bVar.f34480b;
                if (colorDrawable != null) {
                    aVar.f34364q = colorDrawable;
                }
                if (cVar4 != null) {
                    ColorDrawable colorDrawable2 = cVar4.f34486b;
                    if (colorDrawable2 != null) {
                        aVar.f34352d = colorDrawable2;
                    }
                    ColorDrawable colorDrawable3 = cVar4.f34485a;
                    if (colorDrawable3 != null) {
                        aVar.f34351c = Integer.valueOf(colorDrawable3.getColor());
                    }
                    ui.a aVar2 = cVar4.f34487c;
                    if (aVar2 != null) {
                        aVar.f34349a = aVar2.a();
                    }
                    if (cVar4.a() != null) {
                        aVar.f34350b = cVar4.a().floatValue();
                    }
                }
                if (cVar3 != null) {
                    ColorDrawable colorDrawable4 = cVar3.f34486b;
                    if (colorDrawable4 != null) {
                        aVar.f34356h = colorDrawable4;
                    }
                    ColorDrawable colorDrawable5 = cVar3.f34485a;
                    if (colorDrawable5 != null) {
                        aVar.f34355g = Integer.valueOf(colorDrawable5.getColor());
                    }
                    ui.a aVar3 = cVar3.f34487c;
                    if (aVar3 != null) {
                        aVar.f34353e = aVar3.a();
                    }
                    if (cVar3.a() != null) {
                        aVar.f34354f = cVar3.a().floatValue();
                    }
                }
                if (cVar2 != null) {
                    ColorDrawable colorDrawable6 = cVar2.f34486b;
                    if (colorDrawable6 != null) {
                        aVar.f34359l = colorDrawable6;
                    }
                    ColorDrawable colorDrawable7 = cVar2.f34485a;
                    if (colorDrawable7 != null) {
                        aVar.f34358k = Integer.valueOf(colorDrawable7.getColor());
                    }
                    ui.a aVar4 = cVar2.f34487c;
                    if (aVar4 != null) {
                        aVar.i = aVar4.a();
                    }
                    if (cVar2.a() != null) {
                        aVar.f34357j = cVar2.a().floatValue();
                    }
                }
                if (cVar != null) {
                    ColorDrawable colorDrawable8 = cVar.f34486b;
                    if (colorDrawable8 != null) {
                        aVar.f34363p = colorDrawable8;
                    }
                    ColorDrawable colorDrawable9 = cVar.f34485a;
                    if (colorDrawable9 != null) {
                        aVar.f34362o = Integer.valueOf(colorDrawable9.getColor());
                    }
                    ui.a aVar5 = cVar.f34487c;
                    if (aVar5 != null) {
                        aVar.f34360m = aVar5.a();
                    }
                    if (cVar.a() != null) {
                        aVar.f34361n = cVar.a().floatValue();
                    }
                }
                templateView.setStyles(aVar);
                j0Var2.f33843k = templateView;
                templateView.setNativeAd(nativeAd);
                foVar = foVar2;
                j0Var = j0Var2;
                kVar = kVar2;
            } else {
                df.f fVar = j0Var2.f33837d;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
                View viewInflate = fVar.f15790a.inflate(R.layout.my_native_ad, (ViewGroup) null);
                Intrinsics.c(viewInflate, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
                NativeAdView nativeAdView = (NativeAdView) viewInflate;
                MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.ad_media);
                TextView textView = (TextView) nativeAdView.findViewById(R.id.ad_headline);
                TextView textView2 = (TextView) nativeAdView.findViewById(R.id.ad_body);
                View viewFindViewById = nativeAdView.findViewById(R.id.ad_body_spacing);
                Button button = (Button) nativeAdView.findViewById(R.id.ad_call_to_action);
                View viewFindViewById2 = nativeAdView.findViewById(R.id.ad_cta_spacing);
                ImageView imageView = (ImageView) nativeAdView.findViewById(R.id.ad_app_icon);
                TextView textView3 = (TextView) nativeAdView.findViewById(R.id.ad_label_left);
                TextView textView4 = (TextView) nativeAdView.findViewById(R.id.ad_label_right);
                AdChoicesView adChoicesView = (AdChoicesView) nativeAdView.findViewById(R.id.ad_choices_container);
                foVar = foVar2;
                TextView textView5 = (TextView) nativeAdView.findViewById(R.id.ad_advertiser);
                nativeAdView.setMediaView(mediaView);
                nativeAdView.setHeadlineView(textView);
                nativeAdView.setBodyView(textView2);
                nativeAdView.setCallToActionView(button);
                nativeAdView.setIconView(imageView);
                nativeAdView.setAdvertiserView(textView5);
                nativeAdView.setAdChoicesView(adChoicesView);
                String strA = ya.e.a(nativeAd.e());
                String strA2 = ya.e.a(nativeAd.c());
                kVar = kVar2;
                String strA3 = ya.e.a(nativeAd.d());
                String strA4 = ya.e.a(nativeAd.b());
                boolean z5 = utVar != null;
                if (textView != null) {
                    textView.setText(strA == null ? "" : strA);
                }
                if (mediaView != null) {
                    try {
                    } catch (RemoteException e3) {
                        u9.i.f("", e3);
                    }
                    q9.o2 o2Var = foVar.C() != null ? new q9.o2(foVar.C()) : null;
                    mediaView.setMediaContent(o2Var);
                }
                if (strA2 == null) {
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    if (viewFindViewById != null) {
                        viewFindViewById.setVisibility(8);
                    }
                } else {
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    if (viewFindViewById != null) {
                        viewFindViewById.setVisibility(0);
                    }
                    if (textView2 != null) {
                        textView2.setText(strA2);
                    }
                }
                if (strA3 == null) {
                    if (button != null) {
                        button.setVisibility(8);
                    }
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setVisibility(8);
                    }
                } else {
                    if (button != null) {
                        button.setVisibility(0);
                    }
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setVisibility(0);
                    }
                    if (button != null) {
                        button.setText(strA3);
                    }
                }
                if (z5) {
                    if (imageView != null) {
                        imageView.setImageDrawable(utVar != null ? (Drawable) utVar.f11062d : null);
                    }
                    i = 0;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                } else {
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                    i = 0;
                }
                if (strA4 != null) {
                    if (textView5 != null) {
                        textView5.setVisibility(i);
                    }
                    if (textView5 != null) {
                        textView5.setText(strA4);
                    }
                } else if (textView5 != null) {
                    textView5.setVisibility(8);
                }
                nativeAd = ctVar;
                nativeAdView.setNativeAd(nativeAd);
                j0Var = j0Var2;
                j0Var.f33841h = nativeAdView;
            }
            ka.k kVar3 = kVar;
            try {
                foVar.d4(new w2(new r3.b(12, kVar3, j0Var)));
            } catch (RemoteException e7) {
                u9.i.f("Failed to setOnPaidEventListener", e7);
            }
            kVar3.L(j0Var.f33834a, nativeAd.g());
        }
    }

    @Override // xl.n
    public void g(vl.p pVar, int i) {
        StringBuilder sb2 = (StringBuilder) this.f28696c;
        if ((pVar instanceof vl.k) && ((vl.k) pVar).f34922d.f35437b && (pVar.n() instanceof r) && !r.v(sb2)) {
            sb2.append(' ');
        }
    }

    @Override // ob.d4
    public void g0(String str, String str2, Bundle bundle) {
        k2 k2Var = (k2) this.f28696c;
        if (!TextUtils.isEmpty(str)) {
            k2Var.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((l1) k2Var.f15951b).f30269l.getClass();
        k2Var.H("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    @Override // xh.e0
    public void h() {
        ((f0) this.f28696c).f36120c = null;
    }

    @Override // xl.n
    public void j(vl.p pVar, int i) {
        StringBuilder sb2 = (StringBuilder) this.f28696c;
        if (pVar instanceof r) {
            vl.k.u(sb2, (r) pVar);
            return;
        }
        if (pVar instanceof vl.k) {
            vl.k kVar = (vl.k) pVar;
            if (sb2.length() > 0) {
                d0 d0Var = kVar.f34922d;
                if ((d0Var.f35437b || d0Var.f35436a.equals("br")) && !r.v(sb2)) {
                    sb2.append(' ');
                }
            }
        }
    }

    public void k(q4.g gVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f28696c;
        long[] jArr = gVar.f31734e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(gVar.f31734e[0]), gVar);
    }

    @Override // oe.k
    public Object l() {
        Constructor constructor = (Constructor) this.f28696c;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e10.getTargetException());
        }
    }

    public x3.h n(j3.x xVar) {
        xVar.f26407b.getClass();
        xVar.f26407b.getClass();
        return x3.h.f35763a;
    }

    @Override // ed.b, k0.c
    public void onFailure(Throwable th2) {
        switch (this.f28695b) {
            case 2:
                ni.l1.b((z) this.f28696c, th2);
                return;
            case 3:
                ni.l1.b((z) this.f28696c, th2);
                return;
            case 4:
                z zVar = (z) this.f28696c;
                if (th2 instanceof a0.o) {
                    ni.l1.c(null, zVar);
                    return;
                } else {
                    ni.l1.b(zVar, th2);
                    return;
                }
            default:
                synchronized (((h1) this.f28696c).f33063a) {
                    try {
                        ((h1) this.f28696c).f33066d.p();
                        int iM = t.z.m(((h1) this.f28696c).f33071j);
                        if ((iM == 4 || iM == 5 || iM == 6) && !(th2 instanceof CancellationException)) {
                            com.google.android.gms.internal.auth.g.P("CaptureSession", "Opening session with fail ".concat(t.z.o(((h1) this.f28696c).f33071j)), th2);
                            ((h1) this.f28696c).e();
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }

    @Override // ed.b, k0.c
    public void onSuccess(Object obj) {
        switch (this.f28695b) {
            case 2:
                ni.l1.c(null, (z) this.f28696c);
                break;
            case 3:
                ni.l1.c(null, (z) this.f28696c);
                break;
            case 4:
                ni.l1.c(Long.valueOf(((Integer) obj).longValue()), (z) this.f28696c);
                break;
            default:
                break;
        }
    }

    @Override // n5.m
    public void p(byte[] bArr, int i, int i10, n5.l lVar, m3.g gVar) {
        l3.b bVarA;
        m3.p pVar = (m3.p) this.f28696c;
        pVar.K(i + i10, bArr);
        pVar.M(i);
        ArrayList arrayList = new ArrayList();
        while (pVar.a() > 0) {
            h5.g("Incomplete Mp4Webvtt Top Level box header found.", pVar.a() >= 8);
            int iM = pVar.m();
            if (pVar.m() == 1987343459) {
                int i11 = iM - 8;
                CharSequence charSequenceF = null;
                l3.a aVarA = null;
                while (i11 > 0) {
                    h5.g("Incomplete vtt cue box header found.", i11 >= 8);
                    int iM2 = pVar.m();
                    int iM3 = pVar.m();
                    int i12 = iM2 - 8;
                    byte[] bArr2 = pVar.f28589a;
                    int i13 = pVar.f28590b;
                    String str = m3.z.f28608a;
                    String str2 = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    pVar.N(i12);
                    i11 = (i11 - 8) - i12;
                    if (iM3 == 1937011815) {
                        i8 i8Var = new i8();
                        w5.g.e(str2, i8Var);
                        aVarA = i8Var.a();
                    } else if (iM3 == 1885436268) {
                        charSequenceF = w5.g.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (aVarA != null) {
                    aVarA.f27749a = charSequenceF;
                    aVarA.f27750b = null;
                    bVarA = aVarA.a();
                } else {
                    Pattern pattern = w5.g.f35157a;
                    i8 i8Var2 = new i8();
                    i8Var2.f6415c = charSequenceF;
                    bVarA = i8Var2.a().a();
                }
                arrayList.add(bVarA);
            } else {
                pVar.N(iM - 8);
            }
        }
        gVar.accept(new n5.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public w0 q() {
        return (w0) ((t) this.f28696c).F();
    }

    @Override // ob.t0
    public /* synthetic */ void r(String str, int i, Throwable th2, byte[] bArr, Map map) {
        ((z3) this.f28696c).A(str, i, th2, bArr, map);
    }

    @Override // n5.m
    public int s() {
        return 2;
    }

    public int t(byte[] bArr) {
        int i;
        byte b2;
        if (((LargeJpegImageQuirk) this.f28696c) == null || !(("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.f1257a.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.e() || bArr.length > 10000000)) {
            return bArr.length;
        }
        int i10 = 2;
        while (true) {
            if (i10 + 4 <= bArr.length && (b2 = bArr[i10]) == -1) {
                int i11 = i10 + 2;
                int i12 = ((bArr[i11] & 255) << 8) | (bArr[i10 + 3] & 255);
                if (b2 == -1 && bArr[i10 + 1] == -38) {
                    while (true) {
                        i = i11 + 2;
                        if (i <= bArr.length) {
                            if (bArr[i11] == -1 && bArr[i11 + 1] == -39) {
                                break;
                            }
                            i11++;
                        } else {
                            break;
                        }
                    }
                } else {
                    i10 += i12 + 2;
                }
            } else {
                break;
            }
        }
        i = -1;
        return i != -1 ? i : bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(p2.w0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.Object r0 = r5.f28696c
            kk.t r0 = (kk.t) r0
        L9:
            java.lang.Object r1 = r0.F()
            r2 = r1
            p2.w0 r2 = (p2.w0) r2
            boolean r3 = r2 instanceof p2.q0
            if (r3 == 0) goto L16
            r3 = 1
            goto L1c
        L16:
            p2.x0 r3 = p2.x0.f31102b
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r2, r3)
        L1c:
            if (r3 == 0) goto L1f
            goto L29
        L1f:
            boolean r3 = r2 instanceof p2.d
            if (r3 == 0) goto L2b
            int r3 = r6.f31098a
            int r4 = r2.f31098a
            if (r3 <= r4) goto L2f
        L29:
            r2 = r6
            goto L2f
        L2b:
            boolean r3 = r2 instanceof p2.o0
            if (r3 == 0) goto L36
        L2f:
            boolean r1 = r0.E(r1, r2)
            if (r1 == 0) goto L9
            return
        L36:
            ij.j r6 = new ij.j
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.a.u(p2.w0):void");
    }

    public a(la.m mVar, oa.i iVar) {
        this.f28695b = 7;
        this.f28696c = mVar;
    }

    @Override // xh.e0
    public void a(io.flutter.embedding.engine.renderer.j jVar) {
        ((f0) this.f28696c).f36120c = jVar;
    }

    public a(int i) {
        this.f28695b = i;
        switch (i) {
            case 6:
                this.f28696c = (LargeJpegImageQuirk) n0.a.f28964a.i(LargeJpegImageQuirk.class);
                break;
            case 12:
                this.f28696c = new t(x0.f31102b);
                break;
            case 13:
                this.f28696c = new LinkedHashMap();
                break;
            case 25:
                this.f28696c = new m3.p();
                break;
            case 26:
                this.f28696c = (SmallDisplaySizeQuirk) w.a.f34941a.i(SmallDisplaySizeQuirk.class);
                break;
            case 27:
                this.f28696c = (ExtraCroppingQuirk) w.a.f34941a.i(ExtraCroppingQuirk.class);
                break;
            case 28:
                this.f28696c = new Object();
                break;
            default:
                this.f28696c = j0.g.F(Looper.getMainLooper());
                break;
        }
    }

    @Override // io.flutter.view.p
    public void d() {
    }

    @Override // xh.e0
    public void onResume() {
    }

    public a(CameraDevice cameraDevice, Handler handler) {
        this.f28695b = 21;
        if (Build.VERSION.SDK_INT >= 28) {
            cameraDevice.getClass();
            this.f28696c = new u.l(cameraDevice, null);
        } else {
            this.f28696c = new u.k(cameraDevice, new u.m(handler));
        }
    }

    public a(j0 j0Var) {
        this.f28695b = 20;
        this.f28696c = new WeakReference(j0Var);
    }
}
