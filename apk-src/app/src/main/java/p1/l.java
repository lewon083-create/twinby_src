package p1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f30897n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f30898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f30899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f30902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f30903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f30904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30905h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f30906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f30907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f30908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f30909m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30897n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f30897n.get(index)) {
                case 1:
                    this.f30898a = typedArrayObtainStyledAttributes.getFloat(index, this.f30898a);
                    break;
                case 2:
                    this.f30899b = typedArrayObtainStyledAttributes.getFloat(index, this.f30899b);
                    break;
                case 3:
                    this.f30900c = typedArrayObtainStyledAttributes.getFloat(index, this.f30900c);
                    break;
                case 4:
                    this.f30901d = typedArrayObtainStyledAttributes.getFloat(index, this.f30901d);
                    break;
                case 5:
                    this.f30902e = typedArrayObtainStyledAttributes.getFloat(index, this.f30902e);
                    break;
                case 6:
                    this.f30903f = typedArrayObtainStyledAttributes.getDimension(index, this.f30903f);
                    break;
                case 7:
                    this.f30904g = typedArrayObtainStyledAttributes.getDimension(index, this.f30904g);
                    break;
                case 8:
                    this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f30906j = typedArrayObtainStyledAttributes.getDimension(index, this.f30906j);
                    break;
                case 10:
                    this.f30907k = typedArrayObtainStyledAttributes.getDimension(index, this.f30907k);
                    break;
                case 11:
                    this.f30908l = true;
                    this.f30909m = typedArrayObtainStyledAttributes.getDimension(index, this.f30909m);
                    break;
                case 12:
                    this.f30905h = m.f(typedArrayObtainStyledAttributes, index, this.f30905h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
