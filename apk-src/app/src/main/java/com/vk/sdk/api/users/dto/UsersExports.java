package com.vk.sdk.api.users.dto;

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
public final class UsersExports {

    @b("facebook")
    @Nullable
    private final Integer facebook;

    @b("livejournal")
    @Nullable
    private final Integer livejournal;

    @b("twitter")
    @Nullable
    private final Integer twitter;

    public UsersExports() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UsersExports copy$default(UsersExports usersExports, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = usersExports.facebook;
        }
        if ((i & 2) != 0) {
            num2 = usersExports.livejournal;
        }
        if ((i & 4) != 0) {
            num3 = usersExports.twitter;
        }
        return usersExports.copy(num, num2, num3);
    }

    @Nullable
    public final Integer component1() {
        return this.facebook;
    }

    @Nullable
    public final Integer component2() {
        return this.livejournal;
    }

    @Nullable
    public final Integer component3() {
        return this.twitter;
    }

    @NotNull
    public final UsersExports copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        return new UsersExports(num, num2, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersExports)) {
            return false;
        }
        UsersExports usersExports = (UsersExports) obj;
        return Intrinsics.a(this.facebook, usersExports.facebook) && Intrinsics.a(this.livejournal, usersExports.livejournal) && Intrinsics.a(this.twitter, usersExports.twitter);
    }

    @Nullable
    public final Integer getFacebook() {
        return this.facebook;
    }

    @Nullable
    public final Integer getLivejournal() {
        return this.livejournal;
    }

    @Nullable
    public final Integer getTwitter() {
        return this.twitter;
    }

    public int hashCode() {
        Integer num = this.facebook;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.livejournal;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.twitter;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.facebook;
        Integer num2 = this.livejournal;
        return u.m(om1.o("UsersExports(facebook=", ", livejournal=", num, num2, ", twitter="), this.twitter, ")");
    }

    public UsersExports(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.facebook = num;
        this.livejournal = num2;
        this.twitter = num3;
    }

    public /* synthetic */ UsersExports(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
