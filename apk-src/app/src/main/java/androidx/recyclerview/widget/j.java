package androidx.recyclerview.widget;

import android.util.SparseArray;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import k6.b1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    int mAttachCountForClearing;
    Set<g> mAttachedAdaptersForPoolingContainer;
    SparseArray<b1> mScrap;

    public final b1 a(int i) {
        b1 b1Var = this.mScrap.get(i);
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1();
        this.mScrap.put(i, b1Var2);
        return b1Var2;
    }

    public void attach() {
        this.mAttachCountForClearing++;
    }

    public void attachForPoolingContainer(g gVar) {
        this.mAttachedAdaptersForPoolingContainer.add(gVar);
    }

    public void detach() {
        this.mAttachCountForClearing--;
    }

    public void detachForPoolingContainer(g gVar, boolean z5) {
        this.mAttachedAdaptersForPoolingContainer.remove(gVar);
        if (this.mAttachedAdaptersForPoolingContainer.size() != 0 || z5) {
            return;
        }
        for (int i = 0; i < this.mScrap.size(); i++) {
            SparseArray<b1> sparseArray = this.mScrap;
            ArrayList arrayList = sparseArray.get(sparseArray.keyAt(i)).f27040a;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                h5.c(((p) arrayList.get(i10)).itemView);
            }
        }
    }

    public void factorInBindTime(int i, long j10) {
        b1 b1VarA = a(i);
        b1VarA.f27043d = runningAverage(b1VarA.f27043d, j10);
    }

    public void factorInCreateTime(int i, long j10) {
        b1 b1VarA = a(i);
        b1VarA.f27042c = runningAverage(b1VarA.f27042c, j10);
    }

    public void onAdapterChanged(g gVar, g gVar2, boolean z5) {
        if (gVar != null) {
            detach();
        }
        if (!z5 && this.mAttachCountForClearing == 0) {
            for (int i = 0; i < this.mScrap.size(); i++) {
                b1 b1VarValueAt = this.mScrap.valueAt(i);
                Iterator it = b1VarValueAt.f27040a.iterator();
                while (it.hasNext()) {
                    h5.c(((p) it.next()).itemView);
                }
                b1VarValueAt.f27040a.clear();
            }
        }
        if (gVar2 != null) {
            attach();
        }
    }

    public long runningAverage(long j10, long j11) {
        if (j10 == 0) {
            return j11;
        }
        return (j11 / 4) + ((j10 / 4) * 3);
    }

    public boolean willBindInTime(int i, long j10, long j11) {
        long j12 = a(i).f27043d;
        return j12 == 0 || j10 + j12 < j11;
    }

    public boolean willCreateInTime(int i, long j10, long j11) {
        long j12 = a(i).f27042c;
        return j12 == 0 || j10 + j12 < j11;
    }
}
