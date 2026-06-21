package oe;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements WildcardType, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f30643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f30644c;

    public c(Type[] typeArr, Type[] typeArr2) {
        d.c(typeArr2.length <= 1);
        d.c(typeArr.length == 1);
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            d.d(typeArr[0]);
            this.f30644c = null;
            this.f30643b = d.b(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        d.d(typeArr2[0]);
        d.c(typeArr[0] == Object.class);
        this.f30644c = d.b(typeArr2[0]);
        this.f30643b = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.f(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f30644c;
        return type != null ? new Type[]{type} : d.f30645a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f30643b};
    }

    public final int hashCode() {
        Type type = this.f30644c;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f30643b.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f30644c;
        if (type != null) {
            return "? super " + d.m(type);
        }
        Type type2 = this.f30643b;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.m(type2);
    }
}
