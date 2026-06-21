package com.vk.sdk.api.groups.dto;

import gf.a;
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
public final class GroupsGroupTag {

    @b("color")
    @NotNull
    private final Color color;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15181id;

    @b("name")
    @NotNull
    private final String name;

    @b("uses")
    @Nullable
    private final Integer uses;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Color {
        FORTY_FIVE_4647("454647"),
        FORTY_FIVE_678F("45678f"),
        FOUR_BB34B("4bb34b"),
        FIFTY_ONE_81B8("5181b8"),
        FIFTY_THREE_9B9C("539b9c"),
        FIVE_C9CE6("5c9ce6"),
        SIXTY_THREE_B9BA("63b9ba"),
        SIX_BC76B("6bc76b"),
        SEVENTY_SIX_787A("76787a"),
        SEVENTY_NINE_2EC0("792ec0"),
        SEVEN_A6C4F("7a6c4f"),
        SEVEN_ECECF("7ececf"),
        NINE_E8D6B("9e8d6b"),
        A162DE("a162de"),
        AAAEB3("aaaeb3"),
        BBAA84("bbaa84"),
        E64646("e64646"),
        FF5C5C("ff5c5c"),
        FFA000("ffa000"),
        FFC107("ffc107");


        @NotNull
        private final String value;

        Color(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public GroupsGroupTag(int i, @NotNull String name, @NotNull Color color, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        this.f15181id = i;
        this.name = name;
        this.color = color;
        this.uses = num;
    }

    public static /* synthetic */ GroupsGroupTag copy$default(GroupsGroupTag groupsGroupTag, int i, String str, Color color, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = groupsGroupTag.f15181id;
        }
        if ((i10 & 2) != 0) {
            str = groupsGroupTag.name;
        }
        if ((i10 & 4) != 0) {
            color = groupsGroupTag.color;
        }
        if ((i10 & 8) != 0) {
            num = groupsGroupTag.uses;
        }
        return groupsGroupTag.copy(i, str, color, num);
    }

    public final int component1() {
        return this.f15181id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final Color component3() {
        return this.color;
    }

    @Nullable
    public final Integer component4() {
        return this.uses;
    }

    @NotNull
    public final GroupsGroupTag copy(int i, @NotNull String name, @NotNull Color color, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        return new GroupsGroupTag(i, name, color, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupTag)) {
            return false;
        }
        GroupsGroupTag groupsGroupTag = (GroupsGroupTag) obj;
        return this.f15181id == groupsGroupTag.f15181id && Intrinsics.a(this.name, groupsGroupTag.name) && this.color == groupsGroupTag.color && Intrinsics.a(this.uses, groupsGroupTag.uses);
    }

    @NotNull
    public final Color getColor() {
        return this.color;
    }

    public final int getId() {
        return this.f15181id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getUses() {
        return this.uses;
    }

    public int hashCode() {
        int iHashCode = (this.color.hashCode() + a.e(Integer.hashCode(this.f15181id) * 31, 31, this.name)) * 31;
        Integer num = this.uses;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.f15181id;
        String str = this.name;
        Color color = this.color;
        Integer num = this.uses;
        StringBuilder sbI = pe.a.i(i, "GroupsGroupTag(id=", ", name=", str, ", color=");
        sbI.append(color);
        sbI.append(", uses=");
        sbI.append(num);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ GroupsGroupTag(int i, String str, Color color, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, color, (i10 & 8) != 0 ? null : num);
    }
}
