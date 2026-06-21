package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import l.a;
import l.b;
import l.h;
import l.i;
import l.j;
import l.q;
import m.k;
import m.k0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends k0 implements q, View.OnClickListener, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f1048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f1049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f1050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f1051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f1052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f1053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1054h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1057l;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1054h = f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f20295c, 0, 0);
        this.f1055j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1057l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1056k = -1;
        setSaveEnabled(false);
    }

    @Override // m.k
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.q
    public final void b(j jVar) {
        this.f1048b = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitleCondensed());
        setId(jVar.f27648a);
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f1052f == null) {
            this.f1052f = new a(this);
        }
    }

    @Override // m.k
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f1048b.getIcon() == null;
    }

    public final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void g() {
        boolean z5 = true;
        boolean z10 = !TextUtils.isEmpty(this.f1049c);
        if (this.f1050d != null && ((this.f1048b.f27671y & 4) != 4 || (!this.f1054h && !this.i))) {
            z5 = false;
        }
        boolean z11 = z10 & z5;
        setText(z11 ? this.f1049c : null);
        CharSequence charSequence = this.f1048b.f27663q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.f1048b.f27652e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1048b.f27664r;
        if (TextUtils.isEmpty(charSequence2)) {
            a.a.p(this, z11 ? null : this.f1048b.f27652e);
        } else {
            a.a.p(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.q
    public j getItemData() {
        return this.f1048b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f1051e;
        if (hVar != null) {
            hVar.a(this.f1048b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1054h = f();
        g();
    }

    @Override // m.k0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i11 = this.f1056k) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i10);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f1055j;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i10);
        }
        if (!zIsEmpty || this.f1050d == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1050d.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f1048b.hasSubMenu() && (aVar = this.f1052f) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z5) {
        if (this.i != z5) {
            this.i = z5;
            j jVar = this.f1048b;
            if (jVar != null) {
                i iVar = jVar.f27660n;
                iVar.f27637k = true;
                iVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1050d = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1057l;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(h hVar) {
        this.f1051e = hVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i10, int i11, int i12) {
        this.f1056k = i;
        super.setPadding(i, i10, i11, i12);
    }

    public void setPopupCallback(b bVar) {
        this.f1053g = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1049c = charSequence;
        g();
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }
}
