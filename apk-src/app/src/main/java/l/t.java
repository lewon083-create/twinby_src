package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends i implements SubMenu {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f27703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j f27704x;

    public t(Context context, i iVar, j jVar) {
        super(context);
        this.f27703w = iVar;
        this.f27704x = jVar;
    }

    @Override // l.i
    public final boolean d(j jVar) {
        return this.f27703w.d(jVar);
    }

    @Override // l.i
    public final boolean e(i iVar, MenuItem menuItem) {
        return super.e(iVar, menuItem) || this.f27703w.e(iVar, menuItem);
    }

    @Override // l.i
    public final boolean f(j jVar) {
        return this.f27703w.f(jVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f27704x;
    }

    @Override // l.i
    public final i j() {
        return this.f27703w.j();
    }

    @Override // l.i
    public final boolean l() {
        return this.f27703w.l();
    }

    @Override // l.i
    public final boolean m() {
        return this.f27703w.m();
    }

    @Override // l.i
    public final boolean n() {
        return this.f27703w.n();
    }

    @Override // l.i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z5) {
        this.f27703w.setGroupDividerEnabled(z5);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f27704x.setIcon(drawable);
        return this;
    }

    @Override // l.i, android.view.Menu
    public final void setQwertyMode(boolean z5) {
        this.f27703w.setQwertyMode(z5);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        q(0, null, i, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        q(i, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f27704x.setIcon(i);
        return this;
    }
}
