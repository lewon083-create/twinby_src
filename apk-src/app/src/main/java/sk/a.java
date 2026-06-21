package sk;

import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f32909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f32910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f32911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f32912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f32913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f32914g;

    public a(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f32908a = serialName;
        this.f32909b = b0.f27475b;
        this.f32910c = new ArrayList();
        this.f32911d = new HashSet();
        this.f32912e = new ArrayList();
        this.f32913f = new ArrayList();
        this.f32914g = new ArrayList();
    }

    public static void a(a aVar, String elementName, f descriptor) {
        b0 annotations = b0.f27475b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!aVar.f32911d.add(elementName)) {
            StringBuilder sbP = om1.p("Element with name '", elementName, "' is already registered in ");
            sbP.append(aVar.f32908a);
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        aVar.f32910c.add(elementName);
        aVar.f32912e.add(descriptor);
        aVar.f32913f.add(annotations);
        aVar.f32914g.add(false);
    }
}
