package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.twinby.R;
import g2.a2;
import g2.b2;
import g2.f0;
import g2.n0;
import g2.y1;
import g2.z1;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o<S> extends z2.p {
    public CheckableImageButton A0;
    public nc.g B0;
    public boolean C0;
    public CharSequence D0;
    public CharSequence E0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final LinkedHashSet f14598l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final LinkedHashSet f14599m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f14600n0;
    public v o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public c f14601p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public m f14602q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f14603r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CharSequence f14604s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f14605t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f14606u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f14607v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public CharSequence f14608w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f14609x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public CharSequence f14610y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f14611z0;

    public o() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f14598l0 = new LinkedHashSet();
        this.f14599m0 = new LinkedHashSet();
    }

    public static int T(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarB = x.b();
        calendarB.set(5, 1);
        Calendar calendarA = x.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean U(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.gms.internal.auth.m.u(context, m.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z5;
    }

    @Override // z2.p, z2.t
    public final void F(Bundle bundle) {
        super.F(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f14600n0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        c cVar = this.f14601p0;
        b bVar = new b();
        int i = b.f14560b;
        int i10 = b.f14560b;
        long j10 = cVar.f14562b.f14617g;
        long j11 = cVar.f14563c.f14617g;
        bVar.f14561a = Long.valueOf(cVar.f14565e.f14617g);
        int i11 = cVar.f14566f;
        e eVar = cVar.f14564d;
        m mVar = this.f14602q0;
        q qVar = mVar == null ? null : mVar.Y;
        if (qVar != null) {
            bVar.f14561a = Long.valueOf(qVar.f14617g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", eVar);
        q qVarB = q.b(j10);
        q qVarB2 = q.b(j11);
        e eVar2 = (e) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = bVar.f14561a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new c(qVarB, qVarB2, eVar2, l10 == null ? null : q.b(l10.longValue()), i11));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f14603r0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f14604s0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f14607v0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f14608w0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f14609x0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f14610y0);
    }

    @Override // z2.p, z2.t
    public final void G() {
        super.G();
        Dialog dialog = this.f45930g0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f14605t0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.B0);
            if (!this.C0) {
                View viewFindViewById = N().findViewById(R.id.fullscreen_header);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z5 = false;
                boolean z10 = numValueOf == null || numValueOf.intValue() == 0;
                int iO = com.google.android.gms.internal.auth.g.o(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z10) {
                    numValueOf = Integer.valueOf(iO);
                }
                com.google.android.gms.internal.auth.m.v(window, false);
                window.getContext();
                int iE = i < 27 ? x1.a.e(com.google.android.gms.internal.auth.g.o(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iE);
                boolean z11 = com.google.android.gms.internal.auth.g.u(0) || com.google.android.gms.internal.auth.g.u(numValueOf.intValue());
                window.getDecorView();
                int i10 = Build.VERSION.SDK_INT;
                (i10 >= 35 ? new b2(window) : i10 >= 30 ? new a2(window) : i10 >= 26 ? new z1(window) : new y1(window)).w(z11);
                boolean zU = com.google.android.gms.internal.auth.g.u(iO);
                if (com.google.android.gms.internal.auth.g.u(iE) || (iE == 0 && zU)) {
                    z5 = true;
                }
                window.getDecorView();
                int i11 = Build.VERSION.SDK_INT;
                (i11 >= 35 ? new b2(window) : i11 >= 30 ? new a2(window) : i11 >= 26 ? new z1(window) : new y1(window)).v(z5);
                n nVar = new n(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                Field field = n0.f19900a;
                f0.c(viewFindViewById, nVar);
                this.C0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = M().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.B0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f45930g0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new fc.a(dialog2, rect));
        }
        M();
        int i12 = this.f14600n0;
        if (i12 == 0) {
            S();
            throw null;
        }
        S();
        c cVar = this.f14601p0;
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i12);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", cVar.f14565e);
        mVar.P(bundle);
        this.f14602q0 = mVar;
        boolean z12 = this.A0.f14636e;
        v vVar = mVar;
        if (z12) {
            S();
            c cVar2 = this.f14601p0;
            p pVar = new p();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i12);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar2);
            pVar.P(bundle2);
            vVar = pVar;
        }
        this.o0 = vVar;
        this.f14611z0.setText((z12 && M().getResources().getConfiguration().orientation == 2) ? this.E0 : this.D0);
        S();
        throw null;
    }

    @Override // z2.p, z2.t
    public final void H() {
        this.o0.V.clear();
        super.H();
    }

    @Override // z2.p
    public final Dialog R() {
        Context contextM = M();
        M();
        int i = this.f14600n0;
        if (i == 0) {
            S();
            throw null;
        }
        Dialog dialog = new Dialog(contextM, i);
        Context context = dialog.getContext();
        this.f14605t0 = U(context, android.R.attr.windowFullscreen);
        int i10 = com.google.android.gms.internal.auth.m.u(context, o.class.getCanonicalName(), R.attr.colorSurface).data;
        nc.g gVar = new nc.g(context, null, R.attr.materialCalendarStyle, 2131887181);
        this.B0 = gVar;
        gVar.h(context);
        this.B0.j(ColorStateList.valueOf(i10));
        nc.g gVar2 = this.B0;
        View decorView = dialog.getWindow().getDecorView();
        Field field = n0.f19900a;
        gVar2.i(decorView.getElevation());
        return dialog;
    }

    public final void S() {
        if (this.f45973g.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // z2.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f14598l0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // z2.p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f14599m0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.G;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // z2.p, z2.t
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f45973g;
        }
        this.f14600n0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f14601p0 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f14603r0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f14604s0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f14606u0 = bundle.getInt("INPUT_MODE_KEY");
        this.f14607v0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f14608w0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f14609x0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f14610y0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence text = this.f14604s0;
        if (text == null) {
            text = M().getResources().getText(this.f14603r0);
        }
        this.D0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.E0 = text;
    }

    @Override // z2.t
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f14605t0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f14605t0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(T(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(T(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        Field field = n0.f19900a;
        textView.setAccessibilityLiveRegion(1);
        this.A0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f14611z0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.A0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.A0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, a.a.i(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], a.a.i(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.A0.setChecked(this.f14606u0 != 0);
        n0.k(this.A0, null);
        CheckableImageButton checkableImageButton2 = this.A0;
        this.A0.setContentDescription(checkableImageButton2.f14636e ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.A0.setOnClickListener(new l(1, this));
        S();
        throw null;
    }
}
