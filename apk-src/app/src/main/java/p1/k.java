package p1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30896d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f30923g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f30895c = typedArrayObtainStyledAttributes.getFloat(index, this.f30895c);
            } else if (index == 0) {
                int i10 = typedArrayObtainStyledAttributes.getInt(index, this.f30893a);
                this.f30893a = i10;
                this.f30893a = m.f30910d[i10];
            } else if (index == 4) {
                this.f30894b = typedArrayObtainStyledAttributes.getInt(index, this.f30894b);
            } else if (index == 3) {
                this.f30896d = typedArrayObtainStyledAttributes.getFloat(index, this.f30896d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
