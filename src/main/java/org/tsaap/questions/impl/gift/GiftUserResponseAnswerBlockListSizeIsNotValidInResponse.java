/*
 * Tsaap-questions - question model for Java applications
 * Copyright (C) 2013-2016  University Toulouse 3 Paul Sabatier
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.tsaap.questions.impl.gift;

/**
 * @author franck Silvestre
 */
public class GiftUserResponseAnswerBlockListSizeIsNotValidInResponse extends GiftUserResponseException {
    public GiftUserResponseAnswerBlockListSizeIsNotValidInResponse() {
        super("Answer_block_list_size_is_not_valid_in_response");
    }
}
