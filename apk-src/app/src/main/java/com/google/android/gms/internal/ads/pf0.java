package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.twinby.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pf0 extends ug implements q9.u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f9042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f9043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hf0 f9044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r81 f9045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ff0 f9046g;

    public pf0(Context context, WeakReference weakReference, hf0 hf0Var, r81 r81Var) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.f9041b = new HashMap();
        this.f9042c = context;
        this.f9043d = weakReference;
        this.f9044e = hf0Var;
        this.f9045f = r81Var;
    }

    public static String p4(Object obj) {
        k9.r rVarG;
        q9.y1 y1Var;
        if (obj instanceof k9.m) {
            rVarG = ((k9.m) obj).f27274j;
        } else if (obj instanceof wh) {
            rVarG = ((wh) obj).a();
        } else if (obj instanceof v9.a) {
            rVarG = ((v9.a) obj).a();
        } else if (obj instanceof nv) {
            rVarG = ((nv) obj).a();
        } else if (obj instanceof sv) {
            rVarG = ((sv) obj).a();
        } else if (obj instanceof k9.j) {
            rVarG = ((k9.j) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            rVarG = ((NativeAd) obj).g();
        }
        if (rVarG == null || (y1Var = rVarG.f27281a) == null) {
            return "";
        }
        try {
            return y1Var.d();
        } catch (RemoteException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
        xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
        vg.f(parcel);
        w2(string, aVarL1, aVarL12);
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void l4(Object obj, String str) {
        this.f9041b.put(str, obj);
        m4(p4(obj));
    }

    public final synchronized void m4(String str) {
        try {
            jx jxVarD = this.f9046g.d(str);
            ox0 ox0Var = new ox0(23, this);
            jxVarD.a(new l81(0, jxVarD, ox0Var), this.f9045f);
        } catch (NullPointerException e3) {
            p9.k.C.f31302h.d("OutOfContextTester.setAdAsOutOfContext", e3);
            this.f9044e.c();
        }
    }

    public final synchronized void n4(String str) {
        try {
            jx jxVarD = this.f9046g.d(str);
            cf cfVar = new cf(23, this);
            jxVarD.a(new l81(0, jxVarD, cfVar), this.f9045f);
        } catch (NullPointerException e3) {
            p9.k.C.f31302h.d("OutOfContextTester.setAdAsShown", e3);
            this.f9044e.c();
        }
    }

    public final Context o4() {
        Context context = (Context) this.f9043d.get();
        return context == null ? this.f9042c : context;
    }

    @Override // q9.u1
    public final void w2(String str, xa.a aVar, xa.a aVar2) {
        Context context = (Context) xa.b.X1(aVar);
        ViewGroup viewGroup = (ViewGroup) xa.b.X1(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap map = this.f9041b;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof k9.j) {
            k9.j jVar = (k9.j) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            vv.F(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(jVar);
            jVar.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            NativeAdView nativeAdView = new NativeAdView(context);
            nativeAdView.setTag("ad_view_tag");
            vv.F(nativeAdView, -1, -1);
            viewGroup.addView(nativeAdView);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            vv.F(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            nativeAdView.addView(linearLayout2);
            Resources resourcesC = p9.k.C.f31302h.c();
            linearLayout2.addView(vv.D(context, resourcesC == null ? "Headline" : resourcesC.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String strE = nativeAd.e();
            if (strE == null) {
                strE = "";
            }
            View viewD = vv.D(context, strE, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(viewD);
            linearLayout2.addView(viewD);
            linearLayout2.addView(vv.D(context, resourcesC == null ? "Body" : resourcesC.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String strC = nativeAd.c();
            if (strC == null) {
                strC = "";
            }
            View viewD2 = vv.D(context, strC, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            nativeAdView.setBodyView(viewD2);
            linearLayout2.addView(viewD2);
            linearLayout2.addView(vv.D(context, resourcesC == null ? "Media View" : resourcesC.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }
}
