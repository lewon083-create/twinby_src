package com.vk.dto.common.id;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.n;
import me.o;
import me.p;
import me.r;
import me.u;
import me.v;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class UserId implements Parcelable {
    private final long value;
    public static final Companion Companion = new Companion(null);
    public static final UserId DEFAULT = new UserId(0);
    public static final Parcelable.Creator<UserId> CREATOR = new Parcelable.Creator<UserId>() { // from class: com.vk.dto.common.id.UserId$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserId createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new UserId(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserId[] newArray(int i) {
            return new UserId[i];
        }
    };

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserId fromLegacyValue(int i) {
            UserIdKt.legacyObserver.invoke();
            return new UserId(i);
        }

        public final List<UserId> fromLegacyValues(Collection<Integer> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            UserIdKt.legacyObserver.invoke();
            Collection<Integer> collection = value;
            ArrayList arrayList = new ArrayList(t.j(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(UserId.Companion.fromLegacyValue(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        public final synchronized void removeLegacyGlobalObserver() {
            UserIdKt.legacyObserver = UserId$Companion$removeLegacyGlobalObserver$1.INSTANCE;
        }

        public final synchronized void setLegacyGlobalObserver(Function0<Unit> observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            UserIdKt.legacyObserver = observer;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class GsonSerializer implements v, o {
        private final boolean shiftByMaxInt;

        public GsonSerializer() {
            this(false, 1, null);
        }

        public GsonSerializer(boolean z5) {
            this.shiftByMaxInt = z5;
        }

        @Override // me.o
        public UserId deserialize(p pVar, Type type, n nVar) {
            if (pVar == null || (pVar instanceof r)) {
                return null;
            }
            long jC = pVar.c();
            if (!this.shiftByMaxInt) {
                return new UserId(jC);
            }
            boolean z5 = jC < 0;
            long jAbs = Math.abs(jC);
            if (jAbs < 2147483647L) {
                throw new IllegalStateException("abs of owner id should be >= MAX_INT");
            }
            long j10 = jAbs - ((long) Integer.MAX_VALUE);
            if (z5) {
                j10 = -j10;
            }
            return new UserId(j10);
        }

        @Override // me.v
        public p serialize(UserId userId, Type type, u uVar) {
            return new me.t(Long.valueOf(userId == null ? -1L : !this.shiftByMaxInt ? userId.getValue() : userId.getValue() < 0 ? userId.getValue() - ((long) Integer.MAX_VALUE) : userId.getValue() + ((long) Integer.MAX_VALUE)));
        }

        public /* synthetic */ GsonSerializer(boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z5);
        }
    }

    public UserId(long j10) {
        this.value = j10;
    }

    public static /* synthetic */ UserId copy$default(UserId userId, long j10, int i, Object obj) {
        if ((i & 1) != 0) {
            j10 = userId.value;
        }
        return userId.copy(j10);
    }

    public static final UserId fromLegacyValue(int i) {
        return Companion.fromLegacyValue(i);
    }

    public static final List<UserId> fromLegacyValues(Collection<Integer> collection) {
        return Companion.fromLegacyValues(collection);
    }

    public final long component1() {
        return this.value;
    }

    public final UserId copy(long j10) {
        return new UserId(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserId) && this.value == ((UserId) obj).value;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserId(Parcel parcel) {
        this(parcel.readLong());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
