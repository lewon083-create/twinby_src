package com.vk.sdk.api.aliexpress.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseLinkButtonAction;
import java.util.List;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class AliexpressSocialFooter {

    @b("action")
    @Nullable
    private final BaseLinkButtonAction action;

    @b("text")
    @Nullable
    private final String text;

    @b("type")
    @Nullable
    private final Type type;

    @b("user_ids")
    @Nullable
    private final List<UserId> userIds;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        ALIEXPRESS_CAROUSEL("aliexpress_carousel");


        @NotNull
        private final String value;

        Type(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public AliexpressSocialFooter() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AliexpressSocialFooter copy$default(AliexpressSocialFooter aliexpressSocialFooter, Type type, BaseLinkButtonAction baseLinkButtonAction, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            type = aliexpressSocialFooter.type;
        }
        if ((i & 2) != 0) {
            baseLinkButtonAction = aliexpressSocialFooter.action;
        }
        if ((i & 4) != 0) {
            str = aliexpressSocialFooter.text;
        }
        if ((i & 8) != 0) {
            list = aliexpressSocialFooter.userIds;
        }
        return aliexpressSocialFooter.copy(type, baseLinkButtonAction, str, list);
    }

    @Nullable
    public final Type component1() {
        return this.type;
    }

    @Nullable
    public final BaseLinkButtonAction component2() {
        return this.action;
    }

    @Nullable
    public final String component3() {
        return this.text;
    }

    @Nullable
    public final List<UserId> component4() {
        return this.userIds;
    }

    @NotNull
    public final AliexpressSocialFooter copy(@Nullable Type type, @Nullable BaseLinkButtonAction baseLinkButtonAction, @Nullable String str, @Nullable List<UserId> list) {
        return new AliexpressSocialFooter(type, baseLinkButtonAction, str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliexpressSocialFooter)) {
            return false;
        }
        AliexpressSocialFooter aliexpressSocialFooter = (AliexpressSocialFooter) obj;
        return this.type == aliexpressSocialFooter.type && Intrinsics.a(this.action, aliexpressSocialFooter.action) && Intrinsics.a(this.text, aliexpressSocialFooter.text) && Intrinsics.a(this.userIds, aliexpressSocialFooter.userIds);
    }

    @Nullable
    public final BaseLinkButtonAction getAction() {
        return this.action;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Type getType() {
        return this.type;
    }

    @Nullable
    public final List<UserId> getUserIds() {
        return this.userIds;
    }

    public int hashCode() {
        Type type = this.type;
        int iHashCode = (type == null ? 0 : type.hashCode()) * 31;
        BaseLinkButtonAction baseLinkButtonAction = this.action;
        int iHashCode2 = (iHashCode + (baseLinkButtonAction == null ? 0 : baseLinkButtonAction.hashCode())) * 31;
        String str = this.text;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<UserId> list = this.userIds;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AliexpressSocialFooter(type=" + this.type + ", action=" + this.action + ", text=" + this.text + ", userIds=" + this.userIds + ")";
    }

    public AliexpressSocialFooter(@Nullable Type type, @Nullable BaseLinkButtonAction baseLinkButtonAction, @Nullable String str, @Nullable List<UserId> list) {
        this.type = type;
        this.action = baseLinkButtonAction;
        this.text = str;
        this.userIds = list;
    }

    public /* synthetic */ AliexpressSocialFooter(Type type, BaseLinkButtonAction baseLinkButtonAction, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : baseLinkButtonAction, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list);
    }
}
