package u6;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f34301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34305f;

    @Override // u6.r
    public final r addListener(q qVar) {
        return (x) super.addListener(qVar);
    }

    @Override // u6.r
    public final void cancel() {
        super.cancel();
        int size = this.f34301b.size();
        for (int i = 0; i < size; i++) {
            ((r) this.f34301b.get(i)).cancel();
        }
    }

    @Override // u6.r
    public final void captureEndValues(z zVar) {
        View view = zVar.f34310b;
        if (isValidTarget(view)) {
            for (r rVar : this.f34301b) {
                if (rVar.isValidTarget(view)) {
                    rVar.captureEndValues(zVar);
                    zVar.f34311c.add(rVar);
                }
            }
        }
    }

    @Override // u6.r
    public final void capturePropagationValues(z zVar) {
        super.capturePropagationValues(zVar);
        int size = this.f34301b.size();
        for (int i = 0; i < size; i++) {
            ((r) this.f34301b.get(i)).capturePropagationValues(zVar);
        }
    }

    @Override // u6.r
    public final void captureStartValues(z zVar) {
        View view = zVar.f34310b;
        if (isValidTarget(view)) {
            for (r rVar : this.f34301b) {
                if (rVar.isValidTarget(view)) {
                    rVar.captureStartValues(zVar);
                    zVar.f34311c.add(rVar);
                }
            }
        }
    }

    @Override // u6.r
    public final void createAnimators(ViewGroup viewGroup, a0 a0Var, a0 a0Var2, ArrayList arrayList, ArrayList arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f34301b.size();
        for (int i = 0; i < size; i++) {
            r rVar = (r) this.f34301b.get(i);
            if (startDelay > 0 && (this.f34302c || i == 0)) {
                long startDelay2 = rVar.getStartDelay();
                if (startDelay2 > 0) {
                    rVar.setStartDelay(startDelay2 + startDelay);
                } else {
                    rVar.setStartDelay(startDelay);
                }
            }
            rVar.createAnimators(viewGroup, a0Var, a0Var2, arrayList, arrayList2);
        }
    }

    public final void e(r rVar) {
        this.f34301b.add(rVar);
        rVar.mParent = this;
        long j10 = this.mDuration;
        if (j10 >= 0) {
            rVar.setDuration(j10);
        }
        if ((this.f34305f & 1) != 0) {
            rVar.setInterpolator(getInterpolator());
        }
        if ((this.f34305f & 2) != 0) {
            getPropagation();
            rVar.setPropagation(null);
        }
        if ((this.f34305f & 4) != 0) {
            rVar.setPathMotion(getPathMotion());
        }
        if ((this.f34305f & 8) != 0) {
            rVar.setEpicenterCallback(getEpicenterCallback());
        }
    }

    @Override // u6.r
    public final void pause(View view) {
        super.pause(view);
        int size = this.f34301b.size();
        for (int i = 0; i < size; i++) {
            ((r) this.f34301b.get(i)).pause(view);
        }
    }

    @Override // u6.r
    public final r removeListener(q qVar) {
        return (x) super.removeListener(qVar);
    }

    @Override // u6.r
    public final void resume(View view) {
        super.resume(view);
        int size = this.f34301b.size();
        for (int i = 0; i < size; i++) {
            ((r) this.f34301b.get(i)).resume(view);
        }
    }

    @Override // u6.r
    public final void runAnimators() {
        if (this.f34301b.isEmpty()) {
            start();
            end();
            return;
        }
        i iVar = new i();
        iVar.f34286b = this;
        Iterator it = this.f34301b.iterator();
        while (it.hasNext()) {
            ((r) it.next()).addListener(iVar);
        }
        this.f34303d = this.f34301b.size();
        if (this.f34302c) {
            Iterator it2 = this.f34301b.iterator();
            while (it2.hasNext()) {
                ((r) it2.next()).runAnimators();
            }
            return;
        }
        for (int i = 1; i < this.f34301b.size(); i++) {
            ((r) this.f34301b.get(i - 1)).addListener(new i(1, (r) this.f34301b.get(i)));
        }
        r rVar = (r) this.f34301b.get(0);
        if (rVar != null) {
            rVar.runAnimators();
        }
    }

    @Override // u6.r
    public final r setDuration(long j10) {
        ArrayList arrayList;
        super.setDuration(j10);
        if (this.mDuration >= 0 && (arrayList = this.f34301b) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((r) this.f34301b.get(i)).setDuration(j10);
            }
        }
        return this;
    }

    @Override // u6.r
    public final void setEpicenterCallback(p pVar) {
        super.setEpicenterCallback(pVar);
        this.f34305f |= 8;
        int size = this.f34301b.size();
        for (int i = 0; i < size; i++) {
            ((r) this.f34301b.get(i)).setEpicenterCallback(pVar);
        }
    }

    @Override // u6.r
    public final r setInterpolator(TimeInterpolator timeInterpolator) {
        this.f34305f |= 1;
        ArrayList arrayList = this.f34301b;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((r) this.f34301b.get(i)).setInterpolator(timeInterpolator);
            }
        }
        return (x) super.setInterpolator(timeInterpolator);
    }

    @Override // u6.r
    public final void setPathMotion(k kVar) {
        super.setPathMotion(kVar);
        this.f34305f |= 4;
        if (this.f34301b != null) {
            for (int i = 0; i < this.f34301b.size(); i++) {
                ((r) this.f34301b.get(i)).setPathMotion(kVar);
            }
        }
    }

    @Override // u6.r
    public final void setPropagation(w wVar) {
        super.setPropagation(null);
        this.f34305f |= 2;
        int size = this.f34301b.size();
        for (int i = 0; i < size; i++) {
            ((r) this.f34301b.get(i)).setPropagation(null);
        }
    }

    @Override // u6.r
    public final r setStartDelay(long j10) {
        return (x) super.setStartDelay(j10);
    }

    @Override // u6.r
    public final String toString(String str) {
        String string = super.toString(str);
        for (int i = 0; i < this.f34301b.size(); i++) {
            StringBuilder sbK = pe.a.k(string, "\n");
            sbK.append(((r) this.f34301b.get(i)).toString(str + "  "));
            string = sbK.toString();
        }
        return string;
    }

    @Override // u6.r
    public final r clone() {
        x xVar = (x) super.clone();
        xVar.f34301b = new ArrayList();
        int size = this.f34301b.size();
        for (int i = 0; i < size; i++) {
            r rVarClone = ((r) this.f34301b.get(i)).clone();
            xVar.f34301b.add(rVarClone);
            rVarClone.mParent = xVar;
        }
        return xVar;
    }
}
