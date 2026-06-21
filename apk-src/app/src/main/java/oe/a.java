package oe;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f30639b;

    public a(Type type) {
        this.f30639b = d.b(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.f(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f30639b;
    }

    public final int hashCode() {
        return this.f30639b.hashCode();
    }

    public final String toString() {
        return d.m(this.f30639b) + "[]";
    }
}
