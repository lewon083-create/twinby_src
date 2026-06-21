package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements dk.b, Serializable {
    public static final Object NO_RECEIVER = d.f27506b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient dk.b reflected;
    private final String signature;

    public e() {
        this(NO_RECEIVER, null, null, null, false);
    }

    @Override // dk.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // dk.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public dk.b compute() {
        dk.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        dk.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract dk.b computeReflected();

    @Override // dk.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public dk.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return g0.a(cls);
        }
        g0.f27511a.getClass();
        return new w(cls);
    }

    @Override // dk.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public dk.b getReflected() {
        dk.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new vj.a();
    }

    @Override // dk.b
    public dk.j getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // dk.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // dk.b
    public dk.l getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // dk.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // dk.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // dk.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public e(Object obj, Class cls, String str, String str2, boolean z5) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z5;
    }
}
