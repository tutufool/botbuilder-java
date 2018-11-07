package com.microsoft.bot.builder;

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.


import com.fasterxml.jackson.core.JsonProcessingException;
import com.microsoft.bot.schema.models.Activity;

import java.util.concurrent.CompletableFuture;

/**
 Transcript logger stores activities for conversations for recall.
*/
public interface ITranscriptLogger
{
	/** 
	 Log an activity to the transcript.
	 
	 @param activity The activity to transcribe.
	 @return A task that represents the work queued to execute.
	*/
	CompletableFuture LogActivityAsync(Activity activity) throws JsonProcessingException;
}