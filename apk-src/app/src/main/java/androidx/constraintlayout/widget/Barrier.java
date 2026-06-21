package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import m1.a;
import m1.d;
import p1.b;
import p1.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f1275k;

    public Barrier(Context context) {
        super(context);
        this.f30768b = new int[32];
        this.f30774h = new HashMap();
        this.f30770d = context;
        g(null);
        super.setVisibility(8);
    }

    @Override // p1.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        a aVar = new a();
        aVar.f28422s0 = 0;
        aVar.f28423t0 = true;
        aVar.f28424u0 = 0;
        aVar.f28425v0 = false;
        this.f1275k = aVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f30918b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f1275k.f28423t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f1275k.f28424u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f30771e = this.f1275k;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.f1275k.f28423t0;
    }

    public int getMargin() {
        return this.f1275k.f28424u0;
    }

    public int getType() {
        return this.i;
    }

    @Override // p1.b
    public final void h(d dVar, boolean z5) {
        int i = this.i;
        this.f1274j = i;
        if (z5) {
            if (i == 5) {
                this.f1274j = 1;
            } else if (i == 6) {
                this.f1274j = 0;
            }
        } else if (i == 5) {
            this.f1274j = 0;
        } else if (i == 6) {
            this.f1274j = 1;
        }
        if (dVar instanceof a) {
            ((a) dVar).f28422s0 = this.f1274j;
        }
    }

    public void setAllowsGoneWidget(boolean z5) {
        this.f1275k.f28423t0 = z5;
    }

    public void setDpMargin(int i) {
        this.f1275k.f28424u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f1275k.f28424u0 = i;
    }

    public void setType(int i) {
        this.i = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
