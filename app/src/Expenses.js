import React, { Component } from 'react';
import AppNav from './AppNav';
import DatePicker from 'react-datepicker';
import 'react-datepicker/dist/react-datepicker.css';
import './App.css';
import { Table,Container,Input,Button,Label, FormGroup, Form} from 'reactstrap';
import {Link} from 'react-router-dom';

class Expenses extends Component {
	state = {};
	render() {
		return (
			<div>
				<AppNav />
				<Container>
					<Form>
						<FormGroup>
							<label for="title">Title</label>
							<input type="text" name="title" id="title" onChange={this.handleChange} />
						</FormGroup>

						<FormGroup>
							<label for="category">Category</label>
							<input type="text" name="category" id="category" onChange={this.handleChange} />
						</FormGroup>

                        <FormGroup>
							<label for="expenseDate">Expense Date</label>
							<input type="text" name="expenseDate" id="expenseDate" onChange={this.handleChange} />
						</FormGroup>

                        <FormGroup>
							<label for="location">Location</label>
							<input type="text" name="location" id="location" onChange={this.handleChange} />
						</FormGroup>

                        <FormGroup>
                        <Button color="primary" type="submit">Save</Button>{' '}
                        <Button color="secondary" tag={Link} to="/">Cancel</Button>
                    </FormGroup>
					</Form>
				</Container>
				<h2>Expenses</h2>
			</div>
		);
	}
}

export default Expenses;
