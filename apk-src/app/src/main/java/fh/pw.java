package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pw implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18138a;

    public pw(sy syVar) {
        this.f18138a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ww deserialize(ParsingContext parsingContext, ww wwVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = wwVar != null ? wwVar.f18935a : null;
        sy syVar = this.f18138a;
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, syVar.I);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", rw.f18275j, allowPropertyOverride, wwVar != null ? wwVar.f18936b : null, v0.f18733v);
        Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", rw.f18276k, allowPropertyOverride, wwVar != null ? wwVar.f18937c : null, v0.f18734w);
        Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, wwVar != null ? wwVar.f18938d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, rw.f18279n);
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, wwVar != null ? wwVar.f18939e : null, syVar.f18544u1);
        Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, wwVar != null ? wwVar.f18940f : null, syVar.D1);
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Field field2 = wwVar != null ? wwVar.f18941g : null;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "autostart", typeHelper, allowPropertyOverride, field2, function1);
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f22054g, allowPropertyOverride, wwVar != null ? wwVar.f18942h : null, syVar.G1);
        Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, wwVar != null ? wwVar.i : null, syVar.M1);
        Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "buffering_actions", allowPropertyOverride, wwVar != null ? wwVar.f18943j : null, syVar.f18453l1);
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
        Field field3 = wwVar != null ? wwVar.f18944k : null;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field3, function12, rw.f18280o);
        Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, wwVar != null ? wwVar.f18945l : null, syVar.P2);
        Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "elapsed_time_variable", allowPropertyOverride, wwVar != null ? wwVar.f18946m : null);
        Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, wwVar != null ? wwVar.f18947n : null, syVar.f18453l1);
        Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, wwVar != null ? wwVar.f18948o : null, syVar.f18346b3);
        Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "fatal_actions", allowPropertyOverride, wwVar != null ? wwVar.f18949p : null, syVar.f18453l1);
        Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, wwVar != null ? wwVar.f18950q : null, syVar.f18594z3);
        Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, wwVar != null ? wwVar.f18951r : null, syVar.I3);
        Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, wwVar != null ? wwVar.f18952s : null, syVar.U6);
        Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, wwVar != null ? wwVar.f18953t : null);
        Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, wwVar != null ? wwVar.f18954u : null, syVar.K4);
        Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, wwVar != null ? wwVar.f18955v : null, syVar.Y2);
        Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "muted", typeHelper, allowPropertyOverride, wwVar != null ? wwVar.f18956w : null, function1);
        Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, wwVar != null ? wwVar.f18957x : null, syVar.Y2);
        Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "pause_actions", allowPropertyOverride, wwVar != null ? wwVar.f18958y : null, syVar.f18453l1);
        Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "player_settings_payload", allowPropertyOverride, wwVar != null ? wwVar.f18959z : null);
        Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", typeHelper, allowPropertyOverride, wwVar != null ? wwVar.A : null, function1);
        TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
        Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preview", typeHelper3, allowPropertyOverride, wwVar != null ? wwVar.B : null);
        Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "repeatable", typeHelper, allowPropertyOverride, wwVar != null ? wwVar.C : null, function1);
        Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "resume_actions", allowPropertyOverride, wwVar != null ? wwVar.D : null, syVar.f18453l1);
        Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, wwVar != null ? wwVar.E : null);
        Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, wwVar != null ? wwVar.F : null, function12, rw.f18281p);
        Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", rw.f18277l, allowPropertyOverride, wwVar != null ? wwVar.G : null, kv.f17652n);
        Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, wwVar != null ? wwVar.H : null, syVar.f18453l1);
        Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, wwVar != null ? wwVar.I : null, syVar.P8);
        Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, wwVar != null ? wwVar.J : null, syVar.S8);
        Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, wwVar != null ? wwVar.K : null, syVar.V1);
        Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, wwVar != null ? wwVar.L : null, syVar.A1);
        Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, wwVar != null ? wwVar.M : null, syVar.A1);
        Field field4 = wwVar != null ? wwVar.N : null;
        kv kvVar = kv.f17646g;
        xs xsVar = rw.f18282q;
        Intrinsics.c(xsVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, kvVar, xsVar);
        Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, wwVar != null ? wwVar.O : null, syVar.V8);
        Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, wwVar != null ? wwVar.P : null, syVar.f18352b9);
        Field field5 = wwVar != null ? wwVar.Q : null;
        ij.p pVar = syVar.f18384e9;
        xs xsVar2 = rw.f18283r;
        Intrinsics.c(xsVar2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return new ww(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalField2, optionalFieldWithExpression4, optionalListField2, optionalField3, optionalListField3, optionalFieldWithExpression5, optionalListField4, optionalField4, optionalListField5, optionalListField6, optionalListField7, optionalField5, optionalListField8, optionalField6, optionalField7, optionalField8, optionalField9, optionalFieldWithExpression6, optionalField10, optionalListField9, optionalField11, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField10, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalListField11, optionalListField12, optionalField12, optionalField13, optionalField14, optionalField15, optionalListField13, optionalListField14, optionalListField15, JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "video_sources", allowPropertyOverride, field5, pVar, xsVar2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, rw.f18278m, allowPropertyOverride, wwVar != null ? wwVar.R : null, kv.f17653o), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, wwVar != null ? wwVar.S : null, syVar.f18481n9), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, wwVar != null ? wwVar.T : null, syVar.f18481n9), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, wwVar != null ? wwVar.U : null, syVar.U6));
    }
}
