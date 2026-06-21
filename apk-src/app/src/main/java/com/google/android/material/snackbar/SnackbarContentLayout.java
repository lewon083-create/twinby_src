package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.twinby.R;
import g2.n0;
import java.lang.reflect.Field;
import wb.a;
import ya.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f14665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f14666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14667d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e.y(context, R.attr.motionEasingEmphasizedInterpolator, a.f35219b);
    }

    public final boolean a(int i, int i10, int i11) {
        boolean z5;
        if (i != getOrientation()) {
            setOrientation(i);
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f14665b.getPaddingTop() == i10 && this.f14665b.getPaddingBottom() == i11) {
            return z5;
        }
        TextView textView = this.f14665b;
        Field field = n0.f19900a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i10, textView.getPaddingEnd(), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f14666c;
    }

    public TextView getMessageView() {
        return this.f14665b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f14665b = (TextView) findViewById(R.id.snackbar_text);
        this.f14666c = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f14665b.getLayout();
        boolean z5 = layout != null && layout.getLineCount() > 1;
        if (!z5 || this.f14667d <= 0 || this.f14666c.getMeasuredWidth() <= this.f14667d) {
            if (!z5) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i10);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f14667d = i;
    }
}
