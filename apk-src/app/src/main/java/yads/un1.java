package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class un1 extends kk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final co1 f43732c;

    public un1(CustomizableMediaView customizableMediaView, co1 co1Var) {
        super(customizableMediaView);
        this.f43732c = co1Var;
    }

    public abstract void a(CustomizableMediaView customizableMediaView);

    @Override // yads.kk3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(CustomizableMediaView customizableMediaView, qn1 qn1Var) {
        co1 co1Var = this.f43732c;
        tn1 tn1VarD = d();
        if (co1Var.f37457c) {
            if (co1Var.f37455a.f37613a == e00.f37945g) {
                bo1 bo1Var = new bo1(co1Var, customizableMediaView, tn1VarD);
                zl3 zl3Var = nl3.f41290a;
                customizableMediaView.getViewTreeObserver().addOnPreDrawListener(new ml3(customizableMediaView, bo1Var));
            }
            co1Var.f37457c = false;
        }
    }

    public abstract void a(qn1 qn1Var);

    public abstract tn1 d();
}
