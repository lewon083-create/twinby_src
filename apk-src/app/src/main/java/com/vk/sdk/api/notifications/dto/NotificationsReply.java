package com.vk.sdk.api.notifications.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class NotificationsReply {

    @b("date")
    @Nullable
    private final Integer date;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15209id;

    @b("text")
    @Nullable
    private final Integer text;

    public NotificationsReply() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ NotificationsReply copy$default(NotificationsReply notificationsReply, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = notificationsReply.date;
        }
        if ((i & 2) != 0) {
            num2 = notificationsReply.f15209id;
        }
        if ((i & 4) != 0) {
            num3 = notificationsReply.text;
        }
        return notificationsReply.copy(num, num2, num3);
    }

    @Nullable
    public final Integer component1() {
        return this.date;
    }

    @Nullable
    public final Integer component2() {
        return this.f15209id;
    }

    @Nullable
    public final Integer component3() {
        return this.text;
    }

    @NotNull
    public final NotificationsReply copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        return new NotificationsReply(num, num2, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsReply)) {
            return false;
        }
        NotificationsReply notificationsReply = (NotificationsReply) obj;
        return Intrinsics.a(this.date, notificationsReply.date) && Intrinsics.a(this.f15209id, notificationsReply.f15209id) && Intrinsics.a(this.text, notificationsReply.text);
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @Nullable
    public final Integer getId() {
        return this.f15209id;
    }

    @Nullable
    public final Integer getText() {
        return this.text;
    }

    public int hashCode() {
        Integer num = this.date;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f15209id;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.text;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.date;
        Integer num2 = this.f15209id;
        return u.m(om1.o("NotificationsReply(date=", ", id=", num, num2, ", text="), this.text, ")");
    }

    public NotificationsReply(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.date = num;
        this.f15209id = num2;
        this.text = num3;
    }

    public /* synthetic */ NotificationsReply(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
