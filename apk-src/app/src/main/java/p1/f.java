package p1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f30824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f30825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f30826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30827e;

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.f30823a = Float.NaN;
        this.f30824b = Float.NaN;
        this.f30825c = Float.NaN;
        this.f30826d = Float.NaN;
        this.f30827e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f30925j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f30827e);
                this.f30827e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new m().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f30826d = typedArrayObtainStyledAttributes.getDimension(index, this.f30826d);
            } else if (index == 2) {
                this.f30824b = typedArrayObtainStyledAttributes.getDimension(index, this.f30824b);
            } else if (index == 3) {
                this.f30825c = typedArrayObtainStyledAttributes.getDimension(index, this.f30825c);
            } else if (index == 4) {
                this.f30823a = typedArrayObtainStyledAttributes.getDimension(index, this.f30823a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
