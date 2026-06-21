package w2;

import android.text.Editable;
import u2.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f35000a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f35001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f35002c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f35002c;
        return cls != null ? new p(cls, charSequence) : super.newEditable(charSequence);
    }
}
