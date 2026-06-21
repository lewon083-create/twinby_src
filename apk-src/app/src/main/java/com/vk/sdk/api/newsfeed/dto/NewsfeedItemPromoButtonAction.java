package com.vk.sdk.api.newsfeed.dto;

import a0.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class NewsfeedItemPromoButtonAction {

    @b("target")
    @Nullable
    private final String target;

    @b("type")
    @Nullable
    private final String type;

    @b("url")
    @Nullable
    private final String url;

    public NewsfeedItemPromoButtonAction() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ NewsfeedItemPromoButtonAction copy$default(NewsfeedItemPromoButtonAction newsfeedItemPromoButtonAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsfeedItemPromoButtonAction.url;
        }
        if ((i & 2) != 0) {
            str2 = newsfeedItemPromoButtonAction.type;
        }
        if ((i & 4) != 0) {
            str3 = newsfeedItemPromoButtonAction.target;
        }
        return newsfeedItemPromoButtonAction.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @Nullable
    public final String component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.target;
    }

    @NotNull
    public final NewsfeedItemPromoButtonAction copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new NewsfeedItemPromoButtonAction(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemPromoButtonAction)) {
            return false;
        }
        NewsfeedItemPromoButtonAction newsfeedItemPromoButtonAction = (NewsfeedItemPromoButtonAction) obj;
        return Intrinsics.a(this.url, newsfeedItemPromoButtonAction.url) && Intrinsics.a(this.type, newsfeedItemPromoButtonAction.type) && Intrinsics.a(this.target, newsfeedItemPromoButtonAction.target);
    }

    @Nullable
    public final String getTarget() {
        return this.target;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.target;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.type;
        return u.o(z.j("NewsfeedItemPromoButtonAction(url=", str, ", type=", str2, ", target="), this.target, ")");
    }

    public NewsfeedItemPromoButtonAction(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.url = str;
        this.type = str2;
        this.target = str3;
    }

    public /* synthetic */ NewsfeedItemPromoButtonAction(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
