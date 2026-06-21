package p1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f30884j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f30889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f30890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30892h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30884j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f30922f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f30884j.get(index)) {
                case 1:
                    this.f30889e = typedArrayObtainStyledAttributes.getFloat(index, this.f30889e);
                    break;
                case 2:
                    this.f30887c = typedArrayObtainStyledAttributes.getInt(index, this.f30887c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = l1.a.f27747a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f30885a = m.f(typedArrayObtainStyledAttributes, index, this.f30885a);
                    break;
                case 6:
                    this.f30886b = typedArrayObtainStyledAttributes.getInteger(index, this.f30886b);
                    break;
                case 7:
                    this.f30888d = typedArrayObtainStyledAttributes.getFloat(index, this.f30888d);
                    break;
                case 8:
                    this.f30891g = typedArrayObtainStyledAttributes.getInteger(index, this.f30891g);
                    break;
                case 9:
                    this.f30890f = typedArrayObtainStyledAttributes.getFloat(index, this.f30890f);
                    break;
                case 10:
                    int i10 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i10 == 1) {
                        this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i10 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f30892h = string;
                        if (string.indexOf("/") > 0) {
                            this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
