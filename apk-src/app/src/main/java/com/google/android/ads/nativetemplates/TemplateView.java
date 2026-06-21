package com.google.android.ads.nativetemplates;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.ut;
import com.twinby.R;
import com.yandex.varioqub.config.model.ConfigValue;
import ti.x0;
import u8.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class TemplateView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f2514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAd f2515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NativeAdView f2516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f2517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f2518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RatingBar f2519h;
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f2520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaView f2521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f2522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ConstraintLayout f2523m;

    public TemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, x0.f33913a, 0, 0);
        try {
            this.f2513b = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.gnt_medium_template_view);
            typedArrayObtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f2513b, this);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public NativeAdView getNativeAdView() {
        return this.f2516e;
    }

    public String getTemplateTypeName() {
        int i = this.f2513b;
        return i == R.layout.gnt_medium_template_view ? "medium_template" : i == R.layout.gnt_small_template_view ? "small_template" : "";
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2516e = (NativeAdView) findViewById(R.id.native_ad_view);
        this.f2517f = (TextView) findViewById(R.id.primary);
        this.f2518g = (TextView) findViewById(R.id.secondary);
        this.i = (TextView) findViewById(R.id.body);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        this.f2519h = ratingBar;
        ratingBar.setEnabled(false);
        this.f2522l = (Button) findViewById(R.id.cta);
        this.f2520j = (ImageView) findViewById(R.id.icon);
        this.f2521k = (MediaView) findViewById(R.id.media_view);
        this.f2523m = (ConstraintLayout) findViewById(R.id.background);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.f2515d = nativeAd;
        String strI = nativeAd.i();
        String strB = nativeAd.b();
        String strE = nativeAd.e();
        String strC = nativeAd.c();
        String strD = nativeAd.d();
        Double dH = nativeAd.h();
        ut utVarF = nativeAd.f();
        this.f2516e.setCallToActionView(this.f2522l);
        this.f2516e.setHeadlineView(this.f2517f);
        this.f2516e.setMediaView(this.f2521k);
        this.f2518g.setVisibility(0);
        String strI2 = nativeAd.i();
        String strB2 = nativeAd.b();
        if (!TextUtils.isEmpty(strI2) && TextUtils.isEmpty(strB2)) {
            this.f2516e.setStoreView(this.f2518g);
        } else if (TextUtils.isEmpty(strB)) {
            strI = "";
        } else {
            this.f2516e.setAdvertiserView(this.f2518g);
            strI = strB;
        }
        this.f2517f.setText(strE);
        this.f2522l.setText(strD);
        if (dH == null || dH.doubleValue() <= ConfigValue.DOUBLE_DEFAULT_VALUE) {
            this.f2518g.setText(strI);
            this.f2518g.setVisibility(0);
            this.f2519h.setVisibility(8);
        } else {
            this.f2518g.setVisibility(8);
            this.f2519h.setVisibility(0);
            this.f2519h.setRating(dH.floatValue());
            this.f2516e.setStarRatingView(this.f2519h);
        }
        if (utVarF != null) {
            this.f2520j.setVisibility(0);
            this.f2520j.setImageDrawable((Drawable) utVarF.f11062d);
        } else {
            this.f2520j.setVisibility(8);
        }
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(strC);
            this.f2516e.setBodyView(this.i);
        }
        this.f2516e.setNativeAd(nativeAd);
    }

    public void setStyles(a aVar) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        this.f2514c = aVar;
        ColorDrawable colorDrawable = aVar.f34364q;
        if (colorDrawable != null) {
            this.f2523m.setBackground(colorDrawable);
            TextView textView13 = this.f2517f;
            if (textView13 != null) {
                textView13.setBackground(colorDrawable);
            }
            TextView textView14 = this.f2518g;
            if (textView14 != null) {
                textView14.setBackground(colorDrawable);
            }
            TextView textView15 = this.i;
            if (textView15 != null) {
                textView15.setBackground(colorDrawable);
            }
        }
        Typeface typeface = this.f2514c.f34353e;
        if (typeface != null && (textView12 = this.f2517f) != null) {
            textView12.setTypeface(typeface);
        }
        Typeface typeface2 = this.f2514c.i;
        if (typeface2 != null && (textView11 = this.f2518g) != null) {
            textView11.setTypeface(typeface2);
        }
        Typeface typeface3 = this.f2514c.f34360m;
        if (typeface3 != null && (textView10 = this.i) != null) {
            textView10.setTypeface(typeface3);
        }
        Typeface typeface4 = this.f2514c.f34349a;
        if (typeface4 != null && (button4 = this.f2522l) != null) {
            button4.setTypeface(typeface4);
        }
        Integer num = this.f2514c.f34355g;
        if (num != null && (textView9 = this.f2517f) != null) {
            textView9.setTextColor(num.intValue());
        }
        Integer num2 = this.f2514c.f34358k;
        if (num2 != null && (textView8 = this.f2518g) != null) {
            textView8.setTextColor(num2.intValue());
        }
        Integer num3 = this.f2514c.f34362o;
        if (num3 != null && (textView7 = this.i) != null) {
            textView7.setTextColor(num3.intValue());
        }
        Integer num4 = this.f2514c.f34351c;
        if (num4 != null && (button3 = this.f2522l) != null) {
            button3.setTextColor(num4.intValue());
        }
        float f10 = this.f2514c.f34350b;
        if (f10 > 0.0f && (button2 = this.f2522l) != null) {
            button2.setTextSize(f10);
        }
        float f11 = this.f2514c.f34354f;
        if (f11 > 0.0f && (textView6 = this.f2517f) != null) {
            textView6.setTextSize(f11);
        }
        float f12 = this.f2514c.f34357j;
        if (f12 > 0.0f && (textView5 = this.f2518g) != null) {
            textView5.setTextSize(f12);
        }
        float f13 = this.f2514c.f34361n;
        if (f13 > 0.0f && (textView4 = this.i) != null) {
            textView4.setTextSize(f13);
        }
        ColorDrawable colorDrawable2 = this.f2514c.f34352d;
        if (colorDrawable2 != null && (button = this.f2522l) != null) {
            button.setBackground(colorDrawable2);
        }
        ColorDrawable colorDrawable3 = this.f2514c.f34356h;
        if (colorDrawable3 != null && (textView3 = this.f2517f) != null) {
            textView3.setBackground(colorDrawable3);
        }
        ColorDrawable colorDrawable4 = this.f2514c.f34359l;
        if (colorDrawable4 != null && (textView2 = this.f2518g) != null) {
            textView2.setBackground(colorDrawable4);
        }
        ColorDrawable colorDrawable5 = this.f2514c.f34363p;
        if (colorDrawable5 != null && (textView = this.i) != null) {
            textView.setBackground(colorDrawable5);
        }
        invalidate();
        requestLayout();
    }
}
