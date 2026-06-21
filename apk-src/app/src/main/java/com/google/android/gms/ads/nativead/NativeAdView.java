package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.in;
import k6.t0;
import q9.n;
import q9.o;
import q9.r;
import q9.s;
import u9.i;
import xa.a;
import xa.b;
import z9.c;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f2577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final in f2578c;

    public NativeAdView(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f2577b = frameLayout;
        this.f2578c = c();
    }

    public final View a(String str) {
        in inVar = this.f2578c;
        if (inVar != null) {
            try {
                a aVarQ = inVar.Q(str);
                if (aVarQ != null) {
                    return (View) b.X1(aVarQ);
                }
            } catch (RemoteException e3) {
                i.f("Unable to call getAssetView on delegate", e3);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f2577b);
    }

    public final void b(View view, String str) {
        in inVar = this.f2578c;
        if (inVar == null) {
            return;
        }
        try {
            inVar.F3(str, new b(view));
        } catch (RemoteException e3) {
            i.f("Unable to call setAssetView on delegate", e3);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f2577b;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final in c() {
        if (isInEditMode()) {
            return null;
        }
        o oVar = r.f31959g.f31961b;
        FrameLayout frameLayout = this.f2577b;
        Context context = frameLayout.getContext();
        oVar.getClass();
        return (in) new n(oVar, this, frameLayout, context).d(context, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        in inVar = this.f2578c;
        if (inVar != null) {
            if (((Boolean) s.f31967e.f31970c.a(al.Lc)).booleanValue()) {
                try {
                    inVar.a1(new b(motionEvent));
                } catch (RemoteException e3) {
                    i.f("Unable to call handleTouchEvent on delegate", e3);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View viewA = a("3011");
        if (viewA instanceof AdChoicesView) {
            return (AdChoicesView) viewA;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof MediaView) {
            return (MediaView) viewA;
        }
        if (viewA == null) {
            return null;
        }
        i.c("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        in inVar = this.f2578c;
        if (inVar == null) {
            return;
        }
        try {
            inVar.h0(new b(view), i);
        } catch (RemoteException e3) {
            i.f("Unable to call onVisibilityChanged on delegate", e3);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f2577b);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f2577b == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        b(adChoicesView, "3011");
    }

    public final void setAdvertiserView(View view) {
        b(view, "3005");
    }

    public final void setBodyView(View view) {
        b(view, "3004");
    }

    public final void setCallToActionView(View view) {
        b(view, "3002");
    }

    public final void setClickConfirmingView(View view) {
        in inVar = this.f2578c;
        if (inVar == null) {
            return;
        }
        try {
            inVar.H(new b(view));
        } catch (RemoteException e3) {
            i.f("Unable to call setClickConfirmingView on delegate", e3);
        }
    }

    public final void setHeadlineView(View view) {
        b(view, "3001");
    }

    public final void setIconView(View view) {
        b(view, "3003");
    }

    public final void setImageView(View view) {
        b(view, "3008");
    }

    public final void setMediaView(MediaView mediaView) {
        b(mediaView, "3010");
        if (mediaView == null) {
            return;
        }
        t0 t0Var = new t0(26, this);
        synchronized (mediaView) {
            mediaView.f2573d = t0Var;
            if (mediaView.f2572c) {
                t0Var.t(mediaView.f2571b);
            }
        }
        c cVar = new c();
        cVar.f46219a = this;
        synchronized (mediaView) {
            mediaView.f2576g = cVar;
            if (mediaView.f2575f) {
                cVar.a(mediaView.f2574e);
            }
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        in inVar = this.f2578c;
        if (inVar == null) {
            return;
        }
        try {
            inVar.d2(nativeAd.j());
        } catch (RemoteException e3) {
            i.f("Unable to call setNativeAd on delegate", e3);
        }
    }

    public final void setPriceView(View view) {
        b(view, "3007");
    }

    public final void setStarRatingView(View view) {
        b(view, "3009");
    }

    public final void setStoreView(View view) {
        b(view, "3006");
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f2577b = frameLayout;
        this.f2578c = c();
    }
}
