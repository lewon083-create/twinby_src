package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements MenuItem {
    public MenuItem.OnActionExpandListener A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f27652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f27653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f27654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f27655h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f27656j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f27658l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f27660n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t f27661o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f27662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f27663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f27664r;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f27672z;
    public int i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27657k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27659m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f27665s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f27666t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f27667u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f27668v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f27669w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f27670x = 16;
    public boolean B = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f27671y = 0;

    public j(i iVar, int i, int i10, int i11, int i12, CharSequence charSequence) {
        this.f27660n = iVar;
        this.f27648a = i10;
        this.f27649b = i;
        this.f27650c = i11;
        this.f27651d = i12;
        this.f27652e = charSequence;
    }

    public static void a(int i, int i10, String str, StringBuilder sb2) {
        if ((i & i10) == i10) {
            sb2.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f27669w && (this.f27667u || this.f27668v)) {
            drawable = drawable.mutate();
            if (this.f27667u) {
                drawable.setTintList(this.f27665s);
            }
            if (this.f27668v) {
                drawable.setTintMode(this.f27666t);
            }
            this.f27669w = false;
        }
        return drawable;
    }

    public final j c(CharSequence charSequence) {
        this.f27663q = charSequence;
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f27671y & 8) == 0) {
            return false;
        }
        if (this.f27672z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f27660n.d(this);
        }
        return false;
    }

    public final void d(boolean z5) {
        if (z5) {
            this.f27670x |= 32;
        } else {
            this.f27670x &= -33;
        }
    }

    public final j e(CharSequence charSequence) {
        this.f27664r = charSequence;
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.f27671y & 8) == 0 || this.f27672z == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f27660n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f27672z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f27657k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f27656j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f27663q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f27649b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f27658l;
        if (drawable != null) {
            return b(drawable);
        }
        int i = this.f27659m;
        if (i == 0) {
            return null;
        }
        Drawable drawableI = a.a.i(this.f27660n.f27628a, i);
        this.f27659m = 0;
        this.f27658l = drawableI;
        return b(drawableI);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f27665s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f27666t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f27654g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f27648a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f27655h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f27650c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f27661o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f27652e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f27653f;
        return charSequence != null ? charSequence : this.f27652e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f27664r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f27661o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f27670x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f27670x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f27670x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f27670x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f27672z = view;
        if (view != null && view.getId() == -1 && (i = this.f27648a) > 0) {
            view.setId(i);
        }
        i iVar = this.f27660n;
        iVar.f27637k = true;
        iVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8) {
        if (this.f27656j == c8) {
            return this;
        }
        this.f27656j = Character.toLowerCase(c8);
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        int i = this.f27670x;
        int i10 = (z5 ? 1 : 0) | (i & (-2));
        this.f27670x = i10;
        if (i != i10) {
            this.f27660n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        int i = this.f27670x;
        int i10 = i & 4;
        i iVar = this.f27660n;
        if (i10 == 0) {
            int i11 = (i & (-3)) | (z5 ? 2 : 0);
            this.f27670x = i11;
            if (i != i11) {
                iVar.o(false);
            }
            return this;
        }
        ArrayList arrayList = iVar.f27633f;
        int size = arrayList.size();
        iVar.s();
        for (int i12 = 0; i12 < size; i12++) {
            j jVar = (j) arrayList.get(i12);
            if (jVar.f27649b == this.f27649b && (jVar.f27670x & 4) != 0 && jVar.isCheckable()) {
                boolean z10 = jVar == this;
                int i13 = jVar.f27670x;
                int i14 = (z10 ? 2 : 0) | (i13 & (-3));
                jVar.f27670x = i14;
                if (i13 != i14) {
                    jVar.f27660n.o(false);
                }
            }
        }
        iVar.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z5) {
        if (z5) {
            this.f27670x |= 16;
        } else {
            this.f27670x &= -17;
        }
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f27659m = 0;
        this.f27658l = drawable;
        this.f27669w = true;
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f27665s = colorStateList;
        this.f27667u = true;
        this.f27669w = true;
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f27666t = mode;
        this.f27668v = true;
        this.f27669w = true;
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f27654g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8) {
        if (this.f27655h == c8) {
            return this;
        }
        this.f27655h = c8;
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f27662p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c9) {
        this.f27655h = c8;
        this.f27656j = Character.toLowerCase(c9);
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i10 = i & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f27671y = i;
        i iVar = this.f27660n;
        iVar.f27637k = true;
        iVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f27652e = charSequence;
        this.f27660n.o(false);
        t tVar = this.f27661o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f27653f = charSequence;
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        int i = this.f27670x;
        int i10 = (z5 ? 0 : 8) | (i & (-9));
        this.f27670x = i10;
        if (i != i10) {
            i iVar = this.f27660n;
            iVar.f27635h = true;
            iVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f27652e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8, int i) {
        if (this.f27656j == c8 && this.f27657k == i) {
            return this;
        }
        this.f27656j = Character.toLowerCase(c8);
        this.f27657k = KeyEvent.normalizeMetaState(i);
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8, int i) {
        if (this.f27655h == c8 && this.i == i) {
            return this;
        }
        this.f27655h = c8;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c9, int i, int i10) {
        this.f27655h = c8;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f27656j = Character.toLowerCase(c9);
        this.f27657k = KeyEvent.normalizeMetaState(i10);
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f27658l = null;
        this.f27659m = i;
        this.f27669w = true;
        this.f27660n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f27660n.f27628a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i10;
        i iVar = this.f27660n;
        Context context = iVar.f27628a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f27672z = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i10 = this.f27648a) > 0) {
            viewInflate.setId(i10);
        }
        iVar.f27637k = true;
        iVar.o(true);
        return this;
    }
}
