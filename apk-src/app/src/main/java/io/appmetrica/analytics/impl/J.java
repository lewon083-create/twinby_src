package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ye f22469a = C0382oa.k().y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavableToggle f22470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f22471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f22472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f22473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f22474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SavableToggle f22475g;

    public J(C0140em c0140em) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new I(this));
        this.f22470b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f22471c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f22472d = outerStateToggle2;
        this.f22473e = new ConjunctiveCompositeThreadSafeToggle(kotlin.collections.s.f(savableToggle, outerStateToggle), "GAID");
        this.f22474f = new ConjunctiveCompositeThreadSafeToggle(kotlin.collections.s.f(savableToggle, outerStateToggle2), "HOAID");
        this.f22475g = savableToggle;
        a(c0140em);
    }

    public final void a(C0140em c0140em) {
        boolean z5 = c0140em.f23799p;
        boolean z10 = true;
        this.f22471c.update(!z5 || c0140em.f23797n.f24333c);
        OuterStateToggle outerStateToggle = this.f22472d;
        if (z5 && !c0140em.f23797n.f24335e) {
            z10 = false;
        }
        outerStateToggle.update(z10);
    }

    public final G a() {
        int i;
        int i10 = 3;
        int i11 = 4;
        if (this.f22473e.getActualState()) {
            i = 1;
        } else if (this.f22470b.getActualState()) {
            i = !this.f22471c.getActualState() ? 3 : 4;
        } else {
            i = 2;
        }
        if (this.f22474f.getActualState()) {
            i10 = 1;
        } else if (!this.f22470b.getActualState()) {
            i10 = 2;
        } else if (this.f22472d.getActualState()) {
            i10 = 4;
        }
        if (this.f22475g.getActualState()) {
            i11 = 1;
        } else if (!this.f22470b.getActualState()) {
            i11 = 2;
        }
        return new G(i, i10, i11);
    }
}
