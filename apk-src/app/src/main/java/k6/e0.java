package k6;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import yads.t70;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 extends androidx.recyclerview.widget.g {
    final e mDiffer;
    private final d mListener;

    public e0(t70 t70Var) {
        d0 d0Var = new d0(this);
        this.mListener = d0Var;
        v7.f fVar = new v7.f(27, this);
        synchronized (b.f27034a) {
            try {
                if (b.f27035b == null) {
                    b.f27035b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e eVar = new e(fVar, new h3.e(22, b.f27035b, t70Var));
        this.mDiffer = eVar;
        eVar.f27055d.add(d0Var);
    }

    public Object getItem(int i) {
        return this.mDiffer.f27057f.get(i);
    }

    @Override // androidx.recyclerview.widget.g
    public int getItemCount() {
        return this.mDiffer.f27057f.size();
    }

    public void submitList(List<Object> list) {
        e eVar = this.mDiffer;
        v7.f fVar = eVar.f27052a;
        int i = eVar.f27058g + 1;
        eVar.f27058g = i;
        List<Object> list2 = eVar.f27056e;
        if (list == list2) {
            return;
        }
        List list3 = eVar.f27057f;
        if (list == null) {
            int size = list2.size();
            eVar.f27056e = null;
            eVar.f27057f = Collections.EMPTY_LIST;
            fVar.j(0, size);
            eVar.a(list3);
            return;
        }
        if (list2 != null) {
            ((Executor) eVar.f27053b.f20375c).execute(new c(eVar, list2, list, i));
            return;
        }
        eVar.f27056e = list;
        eVar.f27057f = Collections.unmodifiableList(list);
        fVar.c(0, list.size());
        eVar.a(list3);
    }

    public void onCurrentListChanged(List<Object> list, List<Object> list2) {
    }
}
