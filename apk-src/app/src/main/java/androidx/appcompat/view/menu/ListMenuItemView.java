package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.twinby.R;
import g2.n0;
import h.a;
import java.lang.reflect.Field;
import ka.k;
import l.i;
import l.j;
import l.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f1059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f1060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioButton f1061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f1062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CheckBox f1063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f1064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f1065h;
    public ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f1066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Drawable f1067k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1068l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f1069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1070n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f1071o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1072p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LayoutInflater f1073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1074r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k kVarJ = k.J(getContext(), attributeSet, a.f20306o, R.attr.listMenuViewStyle);
        this.f1067k = kVarJ.F(5);
        TypedArray typedArray = (TypedArray) kVarJ.f27325d;
        this.f1068l = typedArray.getResourceId(1, -1);
        this.f1070n = typedArray.getBoolean(7, false);
        this.f1069m = context;
        this.f1071o = kVarJ.F(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1072p = typedArrayObtainStyledAttributes.hasValue(0);
        kVarJ.Q();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1073q == null) {
            this.f1073q = LayoutInflater.from(getContext());
        }
        return this.f1073q;
    }

    private void setSubMenuArrowVisible(boolean z5) {
        ImageView imageView = this.f1065h;
        if (imageView != null) {
            imageView.setVisibility(z5 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        rect.top = this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // l.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(l.j r11) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(l.j):void");
    }

    @Override // l.q
    public j getItemData() {
        return this.f1059b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = n0.f19900a;
        setBackground(this.f1067k);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1062e = textView;
        int i = this.f1068l;
        if (i != -1) {
            textView.setTextAppearance(this.f1069m, i);
        }
        this.f1064g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1065h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1071o);
        }
        this.i = (ImageView) findViewById(R.id.group_divider);
        this.f1066j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        if (this.f1060c != null && this.f1070n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1060c.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i, i10);
    }

    public void setCheckable(boolean z5) {
        CompoundButton compoundButton;
        View view;
        if (!z5 && this.f1061d == null && this.f1063f == null) {
            return;
        }
        if ((this.f1059b.f27670x & 4) != 0) {
            if (this.f1061d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1061d = radioButton;
                LinearLayout linearLayout = this.f1066j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1061d;
            view = this.f1063f;
        } else {
            if (this.f1063f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1063f = checkBox;
                LinearLayout linearLayout2 = this.f1066j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1063f;
            view = this.f1061d;
        }
        if (z5) {
            compoundButton.setChecked(this.f1059b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1063f;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1061d;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z5) {
        CompoundButton compoundButton;
        if ((this.f1059b.f27670x & 4) != 0) {
            if (this.f1061d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1061d = radioButton;
                LinearLayout linearLayout = this.f1066j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1061d;
        } else {
            if (this.f1063f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1063f = checkBox;
                LinearLayout linearLayout2 = this.f1066j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1063f;
        }
        compoundButton.setChecked(z5);
    }

    public void setForceShowIcon(boolean z5) {
        this.f1074r = z5;
        this.f1070n = z5;
    }

    public void setGroupDividerEnabled(boolean z5) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.f1072p || !z5) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        i iVar = this.f1059b.f27660n;
        boolean z5 = this.f1074r;
        if (z5 || this.f1070n) {
            ImageView imageView = this.f1060c;
            if (imageView == null && drawable == null && !this.f1070n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1060c = imageView2;
                LinearLayout linearLayout = this.f1066j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1070n) {
                this.f1060c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1060c;
            if (!z5) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1060c.getVisibility() != 0) {
                this.f1060c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1062e.getVisibility() != 8) {
                this.f1062e.setVisibility(8);
            }
        } else {
            this.f1062e.setText(charSequence);
            if (this.f1062e.getVisibility() != 0) {
                this.f1062e.setVisibility(0);
            }
        }
    }
}
