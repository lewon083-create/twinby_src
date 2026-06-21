package oe;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f30640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f30641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Type[] f30642d;

    public b(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z5 = true;
            boolean z10 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z10) {
                z5 = false;
            }
            d.c(z5);
        }
        this.f30640b = type == null ? null : d.b(type);
        this.f30641c = d.b(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f30642d = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            this.f30642d[i].getClass();
            d.d(this.f30642d[i]);
            Type[] typeArr3 = this.f30642d;
            typeArr3[i] = d.b(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.f(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f30642d.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f30640b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f30641c;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f30642d) ^ this.f30641c.hashCode();
        Type type = this.f30640b;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f30642d;
        int length = typeArr.length;
        Type type = this.f30641c;
        if (length == 0) {
            return d.m(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(d.m(type));
        sb2.append("<");
        sb2.append(d.m(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb2.append(", ");
            sb2.append(d.m(typeArr[i]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
